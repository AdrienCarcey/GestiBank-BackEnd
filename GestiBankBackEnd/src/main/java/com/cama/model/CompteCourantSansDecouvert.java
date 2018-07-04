package com.cama.model;

import java.util.List;

public class CompteCourantSansDecouvert extends Compte {

	//Attributes
	private String rib;
	
	//Constructors
	public CompteCourantSansDecouvert() {
		super();
	}
	
	public CompteCourantSansDecouvert(int idCompte, Boolean statut, double solde,
			List<OperationBancaire> operationsbancaires, String rib) {
		super(idCompte, statut, solde, operationsbancaires);
		this.rib = rib;
	}

	//Getters & Setters
	public String getRib() {
		return rib;
	}

	public void setRib(String rib) {
		this.rib = rib;
	}
}