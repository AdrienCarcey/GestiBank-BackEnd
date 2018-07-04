package com.cama.model;

import java.util.Date;

public class MessagePublic extends Message {
	
	//Attributes
	String titreCivilite;
	String nom;
	String prenom;
	String email;
	
	//Constructors
	public MessagePublic() {
		super();
	}
	
	public MessagePublic(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}
	
	public MessagePublic(String sujet, String message) {
		super(sujet, message);
	}
	
	public MessagePublic(String titreCivilite, String nom, String prenom, String email) {
		super();
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