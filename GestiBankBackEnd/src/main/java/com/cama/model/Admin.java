package com.cama.model;

import java.util.Date;
import java.util.List;

public class Admin extends Utilisateur {
	
	//Attributes
	private Date dateDebutContrat;
	private Date dateFinContrat;
	private List<Conseiller> conseillers;
	
	//Constructors
	public Admin() {
		super();
	}
	
	public Admin(int idUtilisateur, String nomUtilisateur, String motDePasse, Identite identite, Contact contact,
			Date dateDebutContrat, Date dateFinContrat, List<Conseiller> conseillers) {
		super(idUtilisateur, nomUtilisateur, motDePasse, identite, contact);
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