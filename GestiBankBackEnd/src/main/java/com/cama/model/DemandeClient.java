package com.cama.model;

import java.util.Date;

public abstract class DemandeClient extends Demande {
	
	//Attributes
	int idClient;
	
	//Constructors
	public DemandeClient() {
		super();
	}

	public DemandeClient(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeClient(int idClient) {
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