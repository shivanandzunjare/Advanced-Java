package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "producer")
@Getter
@Setter
@NoArgsConstructor

@ToString
public class Producer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	@Column(length = 20)
	private String pName;
	@Column(length = 20)
	private String city;
	@OneToMany(mappedBy = "producer", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	List<Movie> movies = new ArrayList<>();

	public Producer(String pName, String city) {
		super();
		this.pName = pName;
		this.city = city;
	}

	public void insertMovie(Movie movie) {
		movies.add(movie);
		movie.setPthisroducer(this);
	}

	public void delete(Movie movie) {

		movies.remove(movie);

	}

}
