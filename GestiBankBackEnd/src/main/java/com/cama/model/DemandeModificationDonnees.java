package com.cama.model;

import java.util.Date;

public class DemandeModificationDonnees extends DemandeClient {
	
	//Attributes
	Client client;
	
	//Constructors
	public DemandeModificationDonnees() {
		super();
	}

	public DemandeModificationDonnees(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeModificationDonnees(int idClient) {
		super(idClient);
	}

	public DemandeModificationDonnees(Client client) {
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