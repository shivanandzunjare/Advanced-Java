package com.app.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestBody;

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
import com.app.dto.MovieDTO;
import com.app.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping
	public ResponseEntity<?> getAllMovies() {
		System.out.println("in GetAllMovies");
		return ResponseEntity.status(HttpStatus.OK).body(movieService.getMovies());
	}

	@PostMapping
	public ResponseEntity<?> addMovies(@RequestBody @Valid MovieDTO movieDto) {

		return ResponseEntity.status(HttpStatus.CREATED).body(movieService.addMovie(movieDto));

	}
	
	@DeleteMapping("/{mid}")
	public ApiResponse deleteMovie(@PathVariable Long mid) {

		return movieService.deleteMovieByID(mid);

	}
}
