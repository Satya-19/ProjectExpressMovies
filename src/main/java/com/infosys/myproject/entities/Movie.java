package com.infosys.myproject.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Movie {
	@Id
	private int movie_id;
	@Column(length = 100)
	private String movie_title;
	private LocalDate date_released;
	private LocalDateTime movie_running_time;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Movie_Director",
		joinColumns = @JoinColumn(referencedColumnName = "movie_id"),
		inverseJoinColumns = @JoinColumn(referencedColumnName = "director_id"))
	private List<Director> directors;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int movie_id, String movie_title, LocalDate date_released, LocalDateTime movie_running_time) {
		super();
		this.movie_id = movie_id;
		this.movie_title = movie_title;
		this.date_released = date_released;
		this.movie_running_time = movie_running_time;
	}
	
	public List<Director> getDirectors() {
		return directors;
	}
	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public LocalDate getDate_released() {
		return date_released;
	}
	public void setDate_released(LocalDate date_released) {
		this.date_released = date_released;
	}
	public LocalDateTime getMovie_running_time() {
		return movie_running_time;
	}
	public void setMovie_running_time(LocalDateTime movie_running_time) {
		this.movie_running_time = movie_running_time;
	}
	
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", movie_title=" + movie_title + ", date_released=" + date_released
				+ ", movie_running_time=" + movie_running_time + "]";
	}
}
