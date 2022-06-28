package com.infosys.myproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infosys.myproject.entities.Movie;
import com.infosys.myproject.repository.MovieRepo;

@Service
@Transactional
public class MovieServicesImpl implements MovieServices {

	@Autowired
	private MovieRepo movieRepo;
	
	public MovieRepo getMovieRepo() {
		return movieRepo;
	}

	public void setMovieRepo(MovieRepo movieRepo) {
		this.movieRepo = movieRepo;
	}

	@Override
	public Optional<Movie> findMovieByTitle(String title) {
		try {
		Optional<Movie> movie = movieRepo.findByName(title);
		if(movie.isEmpty())
			throw new Exception("Movie not found");
		else
			return movie;			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Movie> findMovieByDirectorName(String firstName, String lastName) {
		try {
			List<Movie> list = movieRepo.searchMovieByDirectorName(firstName, lastName);
			return list;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Movie> findAllMovies() {
		List<Movie> list = movieRepo.findAll();
		return list;
	}

	@Override
	public void addMovie(Movie movie) {
		try {
		Optional<Movie> name = (Optional<Movie>) movieRepo.findByName(movie.getMovie_title());
		
		if(name.isEmpty())
			throw new Exception("Movie already exists");
		else
			movieRepo.save(movie);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateMovie(Movie movie) {
		try {
			Optional<Movie> m = movieRepo.findByName(movie.getMovie_title());
			
			if(m.isEmpty())
				throw new Exception("Movie not found");
			else
				movieRepo.save(movie);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteMovie(String name) {
		try {	
			Optional<Movie> m = movieRepo.findByName(name);
			
			if(m.isEmpty())
				throw new Exception("Movie not found");
			else
				movieRepo.deleteMovieByName(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
