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
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="heritage", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("utilisateur")
public abstract class Utilisateur {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idUtilisateur;
	private String statut;
	private String nomUtilisateur;
	private String motDePasse;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Identite identite;
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Contact contact;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	private List<Demande> demandes;
	
	//Constructors
	public Utilisateur() {
		super();
		this.identite = new Identite();
		this.contact = new Contact();
		this.demandes = new ArrayList<Demande>();
	}

	public Utilisateur(String statut, String nomUtilisateur, String motDePasse, Identite identite, Contact contact,
			List<Demande> demandes) {
		super();
		this.statut = statut;
		this.nomUtilisateur = nomUtilisateur;
		this.motDePasse = motDePasse;
		this.identite = identite;
		this.contact = contact;
		this.demandes = demandes;
	}

	//Getters & Setters
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}
	
	public String getMotDePasse() {
		return motDePasse;
	}
	
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	public Identite getIdentite() {
		return identite;
	}
	
	public void setIdentite(Identite identite) {
		this.identite = identite;
	}
	
	public Contact getContact() {
		return contact;
	}
	
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	public List<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(List<Demande> demandes) {
		this.demandes = demandes;
	}
}