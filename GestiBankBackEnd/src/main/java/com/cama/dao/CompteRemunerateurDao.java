package com.cama.dao;

import java.util.List;

import com.cama.model.CompteRemunerateur;

public interface CompteRemunerateurDao {
	
	List<CompteRemunerateur> findAllComptes();
	
	CompteRemunerateur findCompteById(int id);
	
	void createCompte(CompteRemunerateur compte);

	void deleteCompte(CompteRemunerateur compte);
	
	void updateCompte(CompteRemunerateur compte);
}