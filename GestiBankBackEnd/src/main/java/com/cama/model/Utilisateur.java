package com.cama.model;

public abstract class Utilisateur {
	
	//Attributes
	private int idUtilisateur;
	private String nomUtilisateur;
	private String motDePasse;
	private Identite identite;
	private Contact contact;
	
	//Constructors
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(int idUtilisateur, String nomUtilisateur, String motDePasse, Identite identite,
			Contact contact) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.motDePasse = motDePasse;
		this.identite = identite;
		this.contact = contact;
	}
	
	//Getters & Setters
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
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
}