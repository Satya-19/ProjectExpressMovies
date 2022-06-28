package com.infosys.myproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.myproject.entities.Director;

@Repository
public interface DirectorRepo extends JpaRepository<Director,Integer> {
	public Optional<Director> findByFirstName(String name);
}
