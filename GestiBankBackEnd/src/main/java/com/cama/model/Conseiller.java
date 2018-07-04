package com.cama.model;

import java.util.Date;
import java.util.List;

public class Conseiller extends Utilisateur {

	//Attributes
	private Date dateDebutContrat;
	private Date dateFinContrat;
	private List<Client> clients;
	
	//Constructors
	public Conseiller() {
		super();
	}
	
	public Conseiller(int idUtilisateur, String nomUtilisateur, String motDePasse, Identite identite, Contact contact,
			Date dateDebutContrat, Date dateFinContrat, List<Client> clients) {
		super(idUtilisateur, nomUtilisateur, motDePasse, identite, contact);
		this.dateDebutContrat = dateDebutContrat;
		this.dateFinContrat = dateFinContrat;
		this.clients = clients;
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
	
	public List<Client> getClients() {
		return clients;
	}
	
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}	
}