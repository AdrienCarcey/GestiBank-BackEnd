package com.cama.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Contact {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idContact;
	private String email;
	private String telephone;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Adresse adresse;
	
	//Constructors
	public Contact() {
		super();
		this.adresse = new Adresse();
	}
	
	public Contact(String email, String telephone, Adresse adresse) {
		super();
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	//Getters & Setters
	public int getIdContact() {
		return idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}
	
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