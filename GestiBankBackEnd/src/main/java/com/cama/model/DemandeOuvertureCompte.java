package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("demandeOuvertureCompte")
public class DemandeOuvertureCompte extends DemandeCompte {
	
	//Constructors
	public DemandeOuvertureCompte() {
		super();
	}

	public DemandeOuvertureCompte(Date dateDemande, Date dateTraitement, String statut, int idCompte) {
		super(dateDemande, dateTraitement, statut, idCompte);
	}
}