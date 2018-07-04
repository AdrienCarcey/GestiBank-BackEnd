package com.cama.model;

import java.util.Date;
import java.util.List;

public class Client extends Utilisateur {
	
	//Attributes
	Date dateOuvertureCompte;
	Date dateFermetureCompte;
	SituationFamiliale situationFamiliale;
	Documents documents;
	List<Compte> comptes;
	
	//Constructors
	public Client() {
		super();
	}
	
	public Client(int idUtilisateur, String nomUtilisateur, String motDePasse, Identite identite, Contact contact) {
		super(idUtilisateur, nomUtilisateur, motDePasse, identite, contact);
	}
	
	public Client(Date dateOuvertureCompte, Date dateFermetureCompte, SituationFamiliale situationFamiliale,
			Documents documents, List<Compte> comptes) {
		super();
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.dateFermetureCompte = dateFermetureCompte;
		this.situationFamiliale = situationFamiliale;
		this.documents = documents;
		this.comptes = comptes;
	}
	
	//Getters & Setters
	public Date getDateOuvertureCompte() {
		return dateOuvertureCompte;
	}
	
	public void setDateOuvertureCompte(Date dateOuvertureCompte) {
		this.dateOuvertureCompte = dateOuvertureCompte;
	}
	
	public Date getDateFermetureCompte() {
		return dateFermetureCompte;
	}
	
	public void setDateFermetureCompte(Date dateFermetureCompte) {
		this.dateFermetureCompte = dateFermetureCompte;
	}
	
	public SituationFamiliale getSituationFamiliale() {
		return situationFamiliale;
	}
	
	public void setSituationFamiliale(SituationFamiliale situationFamiliale) {
		this.situationFamiliale = situationFamiliale;
	}
	
	public Documents getDocuments() {
		return documents;
	}
	
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}
	
	public List<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}	
}