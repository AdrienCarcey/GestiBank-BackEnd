package com.cama.model;

import java.util.Date;

public class DemandeInscription extends Demande {
	
	//Attributes
	Client client;
	
	//Constructors
	public DemandeInscription() {
		super();
	}

	public DemandeInscription(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeInscription(Client client) {
		super();
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