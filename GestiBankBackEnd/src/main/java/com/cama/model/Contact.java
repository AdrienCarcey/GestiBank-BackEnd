package com.cama.model;

public class Contact {
	
	//Attributes
	String email;
	String telephone;
	Adresse adresse;
	
	//Constructors
	public Contact() {
		super();
	}
	
	public Contact(String email, String telephone, Adresse adresse) {
		super();
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	//Getters & Setters
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Adresse getAdresse() {
		return adresse;
	}
	
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}