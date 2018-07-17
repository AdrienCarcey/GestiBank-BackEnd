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
	private List<OperationBancaire> operationsBancaires;
	
	//Constructors
	public Compte() {
		super();
		this.operationsBancaires = new ArrayList<OperationBancaire>();
	}
	
	public Compte(Boolean statut, List<OperationBancaire> operationsBancaires) {
		super();
		this.statut = statut;
		this.operationsBancaires = operationsBancaires;
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
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public List<OperationBancaire> getOperationsBancaires() {
		return operationsBancaires;
	}
	
	public void setOperationsBancaires(List<OperationBancaire> operationsBancaires) {
		this.operationsBancaires = operationsBancaires;
	}
	
	//Methods
	public double calculSolde() {
		double solde = 0;
		
		if(this.operationsBancaires.size() != 0) {
			for(OperationBancaire operation: this.operationsBancaires) {
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