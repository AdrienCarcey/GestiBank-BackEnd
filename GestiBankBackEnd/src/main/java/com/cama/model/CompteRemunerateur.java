package com.cama.model;

import java.util.List;

public class CompteRemunerateur extends Compte {
	
	//Attributes
	private double tauxRenumeration;
	
	//Constructors
	public CompteRemunerateur() {
		super();
	}
	
	public CompteRemunerateur(int idCompte, Boolean statut, double solde, List<OperationBancaire> operationsbancaires,
			double tauxRenumeration) {
		super(idCompte, statut, solde, operationsbancaires);
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