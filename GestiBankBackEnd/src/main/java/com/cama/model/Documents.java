package com.cama.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documents {
	
	//Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDocuments;
	private String pieceIdentite;
	private String justificatifDomicile;
	
	//Constructors
	public Documents() {
		super();
	}
	
	public Documents(String pieceIdentite, String justificatifDomicile) {
		super();
		this.pieceIdentite = pieceIdentite;
		this.justificatifDomicile = justificatifDomicile;
	}
	
	//Getters & Setters
	public int getIdDocuments() {
		return idDocuments;
	}

	public void setIdDocuments(int idDocuments) {
		this.idDocuments = idDocuments;
	}
	
	public String getPieceIdentite() {
		return pieceIdentite;
	}

	public void setPieceIdentite(String pieceIdentite) {
		this.pieceIdentite = pieceIdentite;
	}
	
	public String getJustificatifDomicile() {
		return justificatifDomicile;
	}
	
	public void setJustificatifDomicile(String justificatifDomicile) {
		this.justificatifDomicile = justificatifDomicile;
	}
}