package com.infosys.myproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.infosys.myproject.entities.Movie;
import com.infosys.myproject.services.MovieServicesImpl;

@SpringBootApplication
public class ProjectExpressMoviesApplication {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(ProjectExpressMoviesApplication.class, args);
		
		MovieServicesImpl service = (MovieServicesImpl) context.getBean("movieservice");
		Movie movie = new Movie();
		movie.setMovie_id(102);
		movie.setMovie_title("Raaz 2");
		
		System.out.println("***********ExpressMovie Project*****************");
		System.out.println();
		System.out.println("-------------Get all movies---------------------");
		System.out.println(service.findAllMovies());
		System.out.println();
		System.out.println();
		System.out.println("-------------Get all movies from director name---------------------");
		System.out.println(service.findMovieByDirectorName("satya", "jeet"));
		System.out.println();
		System.out.println();
		System.out.println("--------------------Find movie by title----------------------------");
		System.out.println(service.findMovieByTitle("Raaz"));
		System.out.println();
		System.out.println();
		System.out.println("--------------------Update movie by release date---------------------");
		service.updateMovie(movie);
		System.out.println();
		System.out.println();
		System.out.println("--------------------Delete movie by name-----------------------------");
		service.deleteMovie("Raaz");
	}

}
