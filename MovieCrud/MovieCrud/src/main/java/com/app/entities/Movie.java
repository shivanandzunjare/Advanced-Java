package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "movies")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long mid;
	@Column(name = "movie_name", nullable = false, length = 30)
	private String mName;
	@Column(name = "release_date")
	private LocalDate releaseDate;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pid")
	private Producer producer;

	public Movie(String mName, LocalDate releaseDate) {
		super();
		this.mName = mName;
		this.releaseDate = releaseDate;
	}

	public void setProducer(Producer producer2) {
		// TODO Auto-generated method stub
		
	}

	public Object getProducer() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPthisroducer(Producer producer2) {
		// TODO Auto-generated method stub
		
	}

}
