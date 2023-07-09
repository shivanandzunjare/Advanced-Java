package com.app.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.dto.ApiResponse;
import com.app.dto.MovieDTO;
import com.app.entities.Movie;
import com.app.entities.Producer;
import com.app.exception.ResourceNotFoundException;
import com.app.repo.MovieRepo;
import com.app.repo.ProducerRepo;

@Service
@Transactional
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepo movieRepo;
	@Autowired
	private ProducerRepo prodRepo;

	@Override
	public List<Movie> getMovies() {

		return movieRepo.findAll();
	}

	@Override
	public Movie addMovie(MovieDTO movieDto) {
		Movie movie = new Movie(movieDto.getMName(), movieDto.getReleaseDate());
		Producer producer = prodRepo.findById(movieDto.getProducerId())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid producer ID: "));

		producer.insertMovie(movie);

		return movieRepo.save(movie);

	}

	@Override
	public ApiResponse deleteMovieByID(Long mid) {

		Movie movie = movieRepo.findById(mid).orElseThrow(() -> new ResourceNotFoundException("Invalid Id !!!!!!!!!"));
		Producer producer = prodRepo.findById(movie.getProducer().getPid())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Id !!!!!!!!!"));
		movieRepo.delete(movie);
		producer.delete(movie);

		return new ApiResponse("Movie deleted");
	}

}
