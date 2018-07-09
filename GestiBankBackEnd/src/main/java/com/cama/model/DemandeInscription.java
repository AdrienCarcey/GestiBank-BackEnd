package com.cama.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("demandeInscription")
public class DemandeInscription extends Demande {
	
	//Attributes
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Client client;
	
	//Constructors
	public DemandeInscription() {
		super();
		this.client = new Client();
	}
	
	public DemandeInscription(Date dateDemande, Date dateTraitement, String statut, Client client) {
		super(dateDemande, dateTraitement, statut);
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