package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("demandeRIB")
public class DemandeRIB extends DemandeClient {
	
	//Constructors
	public DemandeRIB() {
		super();
	}

	public DemandeRIB(Date dateDemande, Date dateTraitement, String statut) {
		super(dateDemande, dateTraitement, statut);
	}
}