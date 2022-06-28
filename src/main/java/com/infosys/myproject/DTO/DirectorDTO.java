package com.infosys.myproject.DTO;


public class DirectorDTO {
	private int director_id;
	private String first_name;
	private String last_name;
	private String address;
	private long contact_number;
	private String email;
	public DirectorDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DirectorDTO(int director_id, String first_name, String last_name, String address, long contact_number,
			String email) {
		super();
		this.director_id = director_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.contact_number = contact_number;
		this.email = email;
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
		return "DirectorDTO [director_id=" + director_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", address=" + address + ", contact_number=" + contact_number + ", email=" + email + "]";
	}
	
}
