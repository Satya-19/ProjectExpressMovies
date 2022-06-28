package com.infosys.myproject.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infosys.myproject.entities.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {
	@Query("from Movie m where m.movie_title=?1")
	public Optional<Movie> findByName(String name);
	
	@Modifying
	@Query("delete from Movie m where m.movie_title=?1")
	public void deleteMovieByName(String name);
	
	@Modifying
	@Query("update Movie m set m.date_released=?1 where m.movie_title=?2")
	public void updateMovieByTitle(LocalDate date, String name);
	
	@Query(value = "select m.* from Movie m JOIN Movie_Director md ON m.movie_id=md.movie_id JOIN Director d ON d.director_id=md.director_id where d.first_name=?1 and d.last_name=?2", 
			nativeQuery = true)
	public List<Movie> searchMovieByDirectorName(String fname, String lname);
}
