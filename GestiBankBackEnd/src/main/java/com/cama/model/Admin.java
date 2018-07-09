package com.cama.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Utilisateur {
	
	//Attributes
	private Date dateDebutContrat;
	private Date dateFinContrat;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<Conseiller> conseillers;
	
	//Constructors
	public Admin() {
		super();
		this.conseillers = new ArrayList<Conseiller>();
	}
	
	public Admin(String nomUtilisateur, String motDePasse, Identite identite, Contact contact, List<Demande> demandes,
			Date dateDebutContrat, Date dateFinContrat, List<Conseiller> conseillers) {
		super(nomUtilisateur, motDePasse, identite, contact, demandes);
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.conseillers = conseillers;
	}

	//Getters & Setters
	public Date getDateDebutContrat() {
		return dateDebutContrat;
	}
	
	public void setDateDebutContrat(Date dateDebutContrat) {
		this.dateDebutContrat = dateDebutContrat;
	}
	
	public Date getDateFinContrat() {
		return dateFinContrat;
	}
	
	public void setDateFinContrat(Date dateFinContrat) {
		this.dateFinContrat = dateFinContrat;
	}

	public List<Conseiller> getConseillers() {
		return conseillers;
	}

	public void setConseillers(List<Conseiller> conseillers) {
		this.conseillers = conseillers;
	}
}