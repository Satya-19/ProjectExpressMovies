package com.infosys.myproject.services;

import java.util.List;
import java.util.Optional;

import com.infosys.myproject.entities.Movie;

public interface MovieServices {
	public Optional<Movie> findMovieByTitle(String title);
	public List<Movie> findMovieByDirectorName(String firstName, String lastName);
	public List<Movie> findAllMovies();
	public void addMovie(Movie movie);
	public void updateMovie(Movie movie);
	public void deleteMovie(String name);
}
