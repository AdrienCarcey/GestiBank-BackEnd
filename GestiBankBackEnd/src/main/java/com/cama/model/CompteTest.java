package com.cama.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteTest {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rib;
	private String description;
	private Date dateCreation;
	private int solde;
	
	//Constructors
	public CompteTest() {
		super();
	}
	
	public CompteTest(int rib, String description, Date dateCreation, int solde) {
		super();
		this.rib = rib;
		this.description = description;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	
	//Getters & Setters
	public int getRib() {
		return rib;
	}
	
	public void setRib(int rib) {
		this.rib = rib;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public void setSolde(int solde) {
		this.solde = solde;
	}
}