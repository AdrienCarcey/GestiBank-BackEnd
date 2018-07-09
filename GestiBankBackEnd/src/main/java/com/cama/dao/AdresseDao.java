package com.cama.dao;

import java.util.List;

import com.cama.model.Adresse;

public interface AdresseDao {
	
	List<Adresse> findAllAdresses();
	
	Adresse findAdresseById(int id);
	
	void createAdresse(Adresse adresse);

	void deleteAdresse(Adresse adresse);
	
	void updateAdresse(Adresse adresse);
}