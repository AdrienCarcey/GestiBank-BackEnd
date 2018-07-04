package com.cama.model;

public class Documents {
	
	//Attributes
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