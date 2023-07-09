package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.dto.ProducerDTO;
import com.app.entities.Producer;
import com.app.repo.ProducerRepo;

@Service
@Transactional
public class ProducerServiceImpl implements ProducerService {

	@Autowired
	private ProducerRepo prodRepo;
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<Producer> getProducers() {

		return prodRepo.findAll();
	}

	@Override
	public Producer addProducer(ProducerDTO prodDto) {
		System.out.println("In Add Producer");
		System.out.println(prodDto.getPName());
		Producer prod1 = prodRepo.save(mapper.map(prodDto, Producer.class));
//		Producer prod = new Producer(prodDto.getPName(), prodDto.getCity());
		return prod1;
	}

	@Override
	public ApiResponse deleteProducer(Long pid) {
		prodRepo.deleteById(pid);
		return new ApiResponse("Producer Deleted !!!!!");
	}
	
	

}
