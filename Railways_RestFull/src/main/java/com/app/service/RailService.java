package com.app.service;

import java.util.List;

import com.app.DTO.RequestDTO;
import com.app.DTO.ResponseDTO;
import com.app.entities.Category;
import com.app.entities.Rail;

public interface RailService {
	List<Rail> getAllRails();
	
	Rail getAllRailsDetails(Long railId);
	
	Rail addRailDetails(Rail transientRail);
	
	Rail updateRailDetails(Rail detachedRail);
	
	String deleteRailDetails(Long railId);
	
	ResponseDTO getDetailsByCategory(RequestDTO request);

}
