package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.ProducerDTO;
import com.app.service.ProducerService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	public ProducerController() {
		System.out.println("");
	}

	@Autowired
	private ProducerService prodService;

	@GetMapping
	public ResponseEntity<?> getAllProducer() {
		System.out.println("in getAllProducer");
		return ResponseEntity.status(HttpStatus.OK).body(prodService.getProducers());
	}

	@PostMapping("/add")
	public ResponseEntity<?> addProducer(@RequestBody @Valid ProducerDTO prodDto) {

		System.out.println("DTO : " + prodDto.getPName() + " - " + prodDto.getCity());
		return ResponseEntity.status(HttpStatus.CREATED).body(prodService.addProducer(prodDto));
	}

	@DeleteMapping("/{pid}")
	public ApiResponse deleteProducer(@PathVariable Long pid ) {
		
		return prodService.deleteProducer( pid);
	}

}
