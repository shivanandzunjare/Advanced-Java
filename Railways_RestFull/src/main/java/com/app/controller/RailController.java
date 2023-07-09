package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTO.ApiResponse;
import com.app.DTO.RequestDTO;
import com.app.DTO.ResponseDTO;
import com.app.entities.Rail;
import com.app.service.RailService;

@RestController
@RequestMapping("/railways")
public class RailController {
	

	@Autowired
	private RailService railservice;
	
	@GetMapping
	public List<Rail> listRail(){
	return	railservice.getAllRails();
	}

	@GetMapping("/{railId}")
	public Rail getById( @PathVariable Long  railId) {
		return railservice.getAllRailsDetails(railId);
	}
	@PostMapping
	ResponseEntity<Rail> saverailDetails(@RequestBody Rail  transientRail){
		return  new ResponseEntity<Rail>(railservice.addRailDetails(transientRail),HttpStatus.CREATED);
	}

	@PutMapping
	public Rail updateRailInfo( @RequestBody Rail detachedRail) {
		return railservice.updateRailDetails(detachedRail);
	}
	
	@DeleteMapping("/{railId}")
     public ApiResponse deleteRailDetails( @PathVariable Long  railId) {
    	// String mesg=" Rail deleted";
      return new ApiResponse( railservice.deleteRailDetails(railId));
	}
   
      @PostMapping("/{Category}")
      public ResponseDTO getdetailsByCategory( @RequestBody RequestDTO request) {
    	  return railservice.getDetailsByCategory(request);
      }

}
