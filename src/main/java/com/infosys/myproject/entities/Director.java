package com.infosys.myproject.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Director {
	@Id
	private int director_id;
	@Column(length = 100)
	private String first_name;
	@Column(length = 50)
	private String last_name;
	@Column(length = 150)
	private String address;
	private long contact_number;
	@Column(length = 100)
	private String email;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Movie_Director",
			joinColumns = @JoinColumn(referencedColumnName = "director_id"),
			inverseJoinColumns = @JoinColumn(referencedColumnName = "movie_id"))
	private List<Movie> movies;
	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Director(int director_id, String first_name, String last_name, String address, long contact_number,
			String email) {
		super();
		this.director_id = director_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.contact_number = contact_number;
		this.email = email;
	}
	
	public List<Movie> getMovies() {
		return movies;
	}
	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	public int getDirector_id() {
		return director_id;
	}
	public void setDirector_id(int director_id) {
		this.director_id = director_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact_number() {
		return contact_number;
	}
	public void setContact_number(long contact_number) {
		this.contact_number = contact_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Director [director_id=" + director_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", address=" + address + ", contact_number=" + contact_number + ", email=" + email + "]";
	}
}
