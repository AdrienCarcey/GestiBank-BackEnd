package com.cama.service;

import java.util.List;

import com.cama.model.CompteRemunerateur;

public interface CompteRemunerateurService {

	List<CompteRemunerateur> findAllComptes();
	
	CompteRemunerateur findCompteById(int id);
	
	void createCompte(CompteRemunerateur compte);

	void deleteCompte(CompteRemunerateur compte);
	
	void updateCompte(CompteRemunerateur compte);
}