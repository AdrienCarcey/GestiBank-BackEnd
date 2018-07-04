package com.cama.model;

import java.util.Date;

public class DemandeRIB extends DemandeClient {
	
	//Constructors
	public DemandeRIB() {
		super();
	}

	public DemandeRIB(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeRIB(int idClient) {
		super(idClient);
	}	
}