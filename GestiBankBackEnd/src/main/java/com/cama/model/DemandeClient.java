package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("demandeClient")
public abstract class DemandeClient extends Demande {
	
	//Constructors
	public DemandeClient() {
		super();
	}

	public DemandeClient(Date dateDemande, Date dateTraitement, String statut) {
		super(dateDemande, dateTraitement, statut);
	}
}