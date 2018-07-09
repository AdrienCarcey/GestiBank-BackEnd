package com.cama.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Identite {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idIdentite;
	private String titreCivilite;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	//Constructors
	public Identite() {
		super();
	}
	
	public Identite(String titreCivilite, String nom, String prenom, Date dateNaissance) {
		super();
		this.titreCivilite = titreCivilite;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	//Getters & Setters
	public int getIdIdentite() {
		return idIdentite;
	}

	public void setIdIdentite(int idIdentite) {
		this.idIdentite = idIdentite;
	}
	
	public String getTitreCivilite() {
		return titreCivilite;
	}
	
	public void setTitreCivilite(String titreCivilite) {
		this.titreCivilite = titreCivilite;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}
	
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}	
}