package com.app.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;
import com.app.entities.Rail;

public interface RailRepository  extends JpaRepository<Rail, Long>{

	Optional<Rail> findByCategory(Category category);
	

}
