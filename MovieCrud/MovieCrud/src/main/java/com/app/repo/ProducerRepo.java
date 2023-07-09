package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Producer;

@Repository
public interface ProducerRepo extends JpaRepository<Producer, Long> {

	

}
