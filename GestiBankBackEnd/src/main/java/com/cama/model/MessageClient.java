package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("messageClient")
public class MessageClient extends Message {
	
	//Attributes
	private int idClient;
	
	//Constructors
	public MessageClient() {
		super();
	}

	public MessageClient(Date dateDemande, Date dateTraitement, String statut, String sujet, String message,
			int idClient) {
		super(dateDemande, dateTraitement, statut, sujet, message);
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