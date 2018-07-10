package com.cama.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("client")
public class Client extends Utilisateur {
	
	//Attributes
	private Date dateOuvertureCompte;
	private Date dateFermetureCompte;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private SituationFamiliale situationFamiliale;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Documents documents;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<Compte> comptes;
	
	//Constructors
	public Client() {
		super();
		this.situationFamiliale = new SituationFamiliale();
		this.documents = new Documents();
		this.comptes = new ArrayList<Compte>();
	}

	public Client(String statut, String nomUtilisateur, String motDePasse, Identite identite, Contact contact,
			List<Demande> demandes, Date dateOuvertureCompte, Date dateFermetureCompte,
			SituationFamiliale situationFamiliale, Documents documents, List<Compte> comptes) {
		super(statut, nomUtilisateur, motDePasse, identite, contact, demandes);
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