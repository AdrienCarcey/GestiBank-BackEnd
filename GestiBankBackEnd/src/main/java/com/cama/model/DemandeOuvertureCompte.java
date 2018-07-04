package com.cama.model;

import java.util.Date;

public class DemandeOuvertureCompte extends DemandeCompte {
	
	//Constructors
	public DemandeOuvertureCompte() {
		super();
	}

	public DemandeOuvertureCompte(int idDemande, Date dateDemande, Date dateTraitement, String statut, int idCompte,
			com.cama.model.Compte compte) {
		super(idDemande, dateDemande, dateTraitement, statut, idCompte, compte);
	}
}