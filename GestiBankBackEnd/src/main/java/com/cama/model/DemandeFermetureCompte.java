package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("demandeFermetureCompte")
public class DemandeFermetureCompte extends DemandeCompte {
	
	//Constructors
	public DemandeFermetureCompte() {
		super();
	}

	public DemandeFermetureCompte(Date dateDemande, Date dateTraitement, String statut, int idCompte) {
		super(dateDemande, dateTraitement, statut, idCompte);
	}
}