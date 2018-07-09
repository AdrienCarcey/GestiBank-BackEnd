package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("demandeChequier")
public class DemandeChequier extends DemandeClient {
	
	//Constructors
	public DemandeChequier() {
		super();
	}

	public DemandeChequier(Date dateDemande, Date dateTraitement, String statut) {
		super(dateDemande, dateTraitement, statut);
	}
}