package com.cama.model;

import java.util.Date;
import java.util.List;

public class ClientTest {
	
	//Attributes
	int id;
	String firstName;
	String lastName;
	String email;
	String mobil;
	Date dateOfBirth;
	List<CompteTest> comptes;
	
	//Constructors
	public ClientTest() {
		super();
	}
	
	public ClientTest(int id, String firstName, String lastName, String email, String mobil, Date dateOfBirth,
			List<CompteTest> comptes) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobil = mobil;
		this.dateOfBirth = dateOfBirth;
		this.comptes = comptes;
	}
	
	//Getters & Setters
	public long getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobil() {
		return mobil;
	}
	
	public void setMobil(String mobil) {
		this.mobil = mobil;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public List<CompteTest> getComptes() {
		return comptes;
	}
	
	public void setComptes(List<CompteTest> comptes) {
		this.comptes = comptes;
	}	
}