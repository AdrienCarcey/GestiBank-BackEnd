package com.cama.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("compteCourantSansDecouvert")
public class CompteCourantSansDecouvert extends Compte {

	//Attributes
	private String rib;
	
	//Constructors
	public CompteCourantSansDecouvert() {
		super();
	}

	public CompteCourantSansDecouvert(Boolean statut, List<OperationBancaire> operationsbancaires, String rib) {
		super(statut, operationsbancaires);
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