package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {

}
