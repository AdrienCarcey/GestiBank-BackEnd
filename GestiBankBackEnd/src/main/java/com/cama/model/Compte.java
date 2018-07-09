package com.cama.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="heritage", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("compte")
public abstract class Compte {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idCompte;
	private Boolean statut;
	private double solde;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<OperationBancaire> operationsbancaires;
	
	//Constructors
	public Compte() {
		super();
		this.operationsbancaires = new ArrayList<OperationBancaire>();
	}
	
	public Compte(Boolean statut, List<OperationBancaire> operationsbancaires) {
		super();
		this.statut = statut;
		this.operationsbancaires = operationsbancaires;
	}

	//Getters & Setters
	public int getIdCompte() {
		return idCompte;
	}
	
	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	public Boolean getStatut() {
		return statut;
	}
	
	public void setStatut(Boolean statut) {
		this.statut = statut;
	}
	
	public double getSolde() {
		return calculSolde();
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public List<OperationBancaire> getOperationsbancaires() {
		return operationsbancaires;
	}
	
	public void setOperationsbancaires(List<OperationBancaire> operationsbancaires) {
		this.operationsbancaires = operationsbancaires;
	}
	
	//Methods
	public double calculSolde() {
		double solde = 0;
		
		if(this.operationsbancaires.size() != 0) {
			for(OperationBancaire operation: this.operationsbancaires) {
				if(operation instanceof OperationCredit) {
					solde += operation.getMontantOperation();
				}
				else if(operation instanceof OperationDebit) {
					solde -= operation.getMontantOperation();
				}
			}
		}
		
		return solde;
	}
}