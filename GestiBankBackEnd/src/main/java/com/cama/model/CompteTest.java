package com.cama.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CompteTest {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCompte;
	private String description;
	private int solde;
	
	//Constructors
	public CompteTest() {
		super();
	}
	
	public CompteTest(String description, int solde) {
		super();
		this.description = description;
		this.solde = solde;
	}

	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}
	
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getSolde() {
		return solde;
	}
	
	public void setSolde(int solde) {
		this.solde = solde;
	}
}