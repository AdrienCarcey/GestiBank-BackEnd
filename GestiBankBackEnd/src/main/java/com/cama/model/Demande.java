package com.cama.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="heritage", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("demande")
public abstract class Demande {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDemande;
	private Date dateDemande;
	private Date dateTraitement;
	private String statut;
	
	//Constructors
	public Demande() {
		super();
	}
	
	public Demande(Date dateDemande, Date dateTraitement, String statut) {
		super();
		this.dateDemande = dateDemande;
		this.dateTraitement = dateTraitement;
		this.statut = statut;
	}

	//Getters & Setters
	public int getIdDemande() {
		return idDemande;
	}
	
	public void setIdDemande(int idDemande) {
		this.idDemande = idDemande;
	}
	
	public Date getDateDemande() {
		return dateDemande;
	}
	
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	
	public Date getDateTraitement() {
		return dateTraitement;
	}
	
	public void setDateTraitement(Date dateTraitement) {
		this.dateTraitement = dateTraitement;
	}
	
	public String getStatut() {
		return statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}	
}