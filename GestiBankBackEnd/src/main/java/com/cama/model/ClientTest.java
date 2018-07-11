package com.cama.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class ClientTest {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idClient;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<CompteTest> comptes;
	
	//Constructors
	public ClientTest() {
		super();
		this.comptes = new ArrayList<CompteTest>();
	}
	
	public ClientTest(String firstName, String lastName, String email, String mobile, List<CompteTest> comptes) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.comptes = comptes;
	}

	//Getters & Setters
	public long getIdClient() {
		return idClient;
	}
	
	public void setId(int idClient) {
		this.idClient = idClient;
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
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public List<CompteTest> getComptes() {
		return comptes;
	}
	
	public void setComptes(List<CompteTest> comptes) {
		this.comptes = comptes;
	}	
}