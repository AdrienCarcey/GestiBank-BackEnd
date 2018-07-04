package com.cama.model;

import java.util.Date;

public class DemandeModificationDonnees extends DemandeClient {
	
	//Attributes
	private Client client;
	
	//Constructors
	public DemandeModificationDonnees() {
		super();
	}

	public DemandeModificationDonnees(int idDemande, Date dateDemande, Date dateTraitement, String statut,
			Client client) {
		super(idDemande, dateDemande, dateTraitement, statut);
		this.client = client;
	}

	//Getters & Setters
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}	
}