package com.cama.model;

import java.util.Date;

public class DemandeFermetureCompte extends DemandeCompte {
	
	//Constructors
	public DemandeFermetureCompte() {
		super();
	}

	public DemandeFermetureCompte(int idDemande, Date dateDemande, Date dateTraitement, String statut, int idCompte,
			com.cama.model.Compte compte) {
		super(idDemande, dateDemande, dateTraitement, statut, idCompte, compte);
	}
}