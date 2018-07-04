package com.cama.model;

import java.util.Date;

public class DemandeChequier extends DemandeClient {
	
	//Constructors
	public DemandeChequier() {
		super();
	}

	public DemandeChequier(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeChequier(int idClient) {
		super(idClient);
	}
}