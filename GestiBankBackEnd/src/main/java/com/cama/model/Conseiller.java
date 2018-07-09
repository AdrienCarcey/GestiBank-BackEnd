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
@DiscriminatorValue("conseiller")
public class Conseiller extends Utilisateur {

	//Attributes
	private Date dateDebutContrat;
	private Date dateFinContrat;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<Client> clients;
	
	//Constructors
	public Conseiller() {
		super();
		this.clients = new ArrayList<Client>();
		
	}

	public Conseiller(String nomUtilisateur, String motDePasse, Identite identite, Contact contact,
			List<Demande> demandes, Date dateDebutContrat, Date dateFinContrat, List<Client> clients) {
		super(nomUtilisateur, motDePasse, identite, contact, demandes);
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