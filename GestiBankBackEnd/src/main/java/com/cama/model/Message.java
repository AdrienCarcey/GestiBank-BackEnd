package com.cama.model;

import java.util.Date;

public abstract class Message extends Demande {
	
	//Attributes
	private String sujet;
	private String message;
	
	//Constructors
	public Message() {
		super();
	}
	
	public Message(int idDemande, Date dateDemande, Date dateTraitement, String statut, String sujet, String message) {
		super(idDemande, dateDemande, dateTraitement, statut);
		this.sujet = sujet;
		this.message = message;
	}

	//Getters & Setters
	public String getSujet() {
		return sujet;
	}
	
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}	
}