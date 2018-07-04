package com.cama.model;

import java.util.Date;
import java.util.List;

public class Client extends Utilisateur {
	
	//Attributes
	private Date dateOuvertureCompte;
	private Date dateFermetureCompte;
	private SituationFamiliale situationFamiliale;
	private Documents documents;
	private List<Compte> comptes;
	private List<DemandeClient> demandes;
	
	//Constructors
	public Client() {
		super();
	}
	
	public Client(int idUtilisateur, String nomUtilisateur, String motDePasse, Identite identite, Contact contact,
			Date dateOuvertureCompte, Date dateFermetureCompte, SituationFamiliale situationFamiliale,
			Documents documents, List<Compte> comptes, List<DemandeClient> demandes) {
		super(idUtilisateur, nomUtilisateur, motDePasse, identite, contact);
		this.dateOuvertureCompte = dateOuvertureCompte;
		this.dateFermetureCompte = dateFermetureCompte;
		this.situationFamiliale = situationFamiliale;
		this.documents = documents;
		this.comptes = comptes;
		this.demandes = demandes;
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

	public List<DemandeClient> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<DemandeClient> demandes) {
		this.demandes = demandes;
	}	
}