package com.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.app.dto.ApiResponse;
import com.app.dto.MovieDTO;
import com.app.entities.Movie;

public interface MovieService {

	List<Movie> getMovies();

	Movie addMovie(MovieDTO movieDto);

	ApiResponse deleteMovieByID(Long mid);

}
