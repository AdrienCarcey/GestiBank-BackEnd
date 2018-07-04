package com.cama.model;

import java.util.Date;

public class DemandeOuvertureCompte extends DemandeCompte {
	
	//Constructors
	public DemandeOuvertureCompte() {
		super();
	}

	public DemandeOuvertureCompte(int idCompte, com.cama.model.Compte compte) {
		super(idCompte, compte);
	}

	public DemandeOuvertureCompte(int idDemande, Date dateDemande, Date dateTraitement, String statut) {
		super(idDemande, dateDemande, dateTraitement, statut);
	}

	public DemandeOuvertureCompte(int idClient) {
		super(idClient);
	}
}