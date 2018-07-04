package com.cama.model;

import java.util.Date;

public abstract class DemandeClient extends Demande {
	
	//Constructors
	public DemandeClient() {
		super();
	}

	public DemandeClient(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}
}