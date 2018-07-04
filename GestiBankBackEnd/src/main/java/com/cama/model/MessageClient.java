package com.cama.model;

import java.util.Date;

public class MessageClient extends Message {
	
	//Attributes
	private int idClient;
	
	//Constructors
	public MessageClient() {
		super();
	}
	
	public MessageClient(int idDemande, Date dateDemande, Date dateTraitement, String statut, String sujet,
			String message, int idClient) {
		super(idDemande, dateDemande, dateTraitement, statut, sujet, message);
		this.idClient = idClient;
	}

	//Getters & Setters
	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}	
}