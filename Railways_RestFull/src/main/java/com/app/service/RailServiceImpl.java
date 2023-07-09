package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DTO.RequestDTO;
import com.app.DTO.ResponseDTO;
import com.app.custom_exception.ResourceNotFoundException;
import com.app.entities.Category;
import com.app.entities.Rail;
import com.app.repo.RailRepository;

@Service
@Transactional
public class RailServiceImpl  implements RailService{

	
	@Autowired 
	private ModelMapper mapper;
	@Autowired
	private RailRepository railRepo;
	@Override
	public List<Rail> getAllRails() {
	
		return railRepo.findAll();
	}
	@Override
	public Rail addRailDetails(Rail transientRail) {
		
		return  railRepo.save( transientRail);
	}
	@Override
	public Rail updateRailDetails(Rail detachedRail) {
		
		return railRepo.save(detachedRail);
	}
	@Override
	public String deleteRailDetails(Long railId) {
		String mesg=" invalid id ";
		if(railRepo.existsById(railId))
			railRepo.deleteById(railId);
		mesg=" rail Details deleted";
		return mesg;
	}
	@Override
	public Rail getAllRailsDetails(Long railId) {
		
		return railRepo.findById(railId).orElseThrow(()-> new ResourceNotFoundException("invalid"));
	}
	@Override
	public ResponseDTO getDetailsByCategory(RequestDTO request) {
		Rail rail=railRepo.findByCategory(request.getCategory())
				.orElseThrow(() -> new ResourceNotFoundException(" invalid category name"));
		ResponseDTO resDto=mapper.map(rail, ResponseDTO.class);
		return resDto;
	}
	

	
}
