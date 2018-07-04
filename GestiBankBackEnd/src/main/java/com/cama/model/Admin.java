package com.cama.model;

import java.util.Date;

public class Admin extends Utilisateur {
	
	//Attributes
	Date dateDebutContrat;
	Date dateFinContrat;
	
	//Constructors
	public Admin() {
		super();
	}
	
	public Admin(int idUtilisateur, String nomUtilisateur, String motDePasse, Identite identite, Contact contact) {
		super(idUtilisateur, nomUtilisateur, motDePasse, identite, contact);
	}
	
	public Admin(Date dateDebutContrat, Date dateFinContrat) {
		super();
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
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
}