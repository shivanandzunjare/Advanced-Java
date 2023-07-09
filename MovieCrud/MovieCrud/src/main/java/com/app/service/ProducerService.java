package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.dto.ProducerDTO;
import com.app.entities.Producer;

public interface ProducerService {

	List<Producer> getProducers();

	Producer addProducer(ProducerDTO prodDto);

	ApiResponse deleteProducer(Long pid);

}
