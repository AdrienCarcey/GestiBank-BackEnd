package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("messagePublic")
public class MessagePublic extends Message {
	
	//Attributes
	private String titreCivilite;
	private String nom;
	private String prenom;
	private String email;
	
	//Constructors
	public MessagePublic() {
		super();
	}
	
	public MessagePublic(Date dateDemande, Date dateTraitement, String statut, String sujet, String message,
			String titreCivilite, String nom, String prenom, String email) {
		super(dateDemande, dateTraitement, statut, sujet, message);
		this.titreCivilite = titreCivilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	//Getters & Setters
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}	
}