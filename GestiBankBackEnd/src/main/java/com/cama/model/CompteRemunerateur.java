package com.cama.model;

import java.util.List;

public class CompteRemunerateur extends Compte {
	
	//Attributes
	double tauxRenumeration;
	
	//Constructors
	public CompteRemunerateur() {
		super();
	}

	public CompteRemunerateur(int idCompte, Boolean statut, double solde, List<OperationBancaire> operationsbancaires) {
		super(idCompte, statut, solde, operationsbancaires);
	}

	public CompteRemunerateur(double tauxRenumeration) {
		super();
		this.tauxRenumeration = tauxRenumeration;
	}
	
	//Getters & Setters
	public double getTauxRenumeration() {
		return tauxRenumeration;
	}

	public void setTauxRenumeration(double tauxRenumeration) {
		this.tauxRenumeration = tauxRenumeration;
	}	
}