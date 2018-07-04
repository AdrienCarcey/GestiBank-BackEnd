package com.cama.model;

import java.util.Date;

public class DemandeFermetureCompte extends DemandeCompte {
	
	//Constructors
	public DemandeFermetureCompte() {
		super();
	}

	public DemandeFermetureCompte(int idCompte, com.cama.model.Compte compte) {
		super(idCompte, compte);
	}

	public DemandeFermetureCompte(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeFermetureCompte(int idClient) {
		super(idClient);
	}
}