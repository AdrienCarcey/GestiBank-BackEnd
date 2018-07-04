package com.cama.model;

import java.util.Date;

public class MessageClient extends Message {
	
	//Attributes
	int idClient;
	
	//Constructors
	public MessageClient() {
		super();
	}

	public MessageClient(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public MessageClient(String sujet, String message) {
		super(sujet, message);
	}

	public MessageClient(int idClient) {
		super();
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