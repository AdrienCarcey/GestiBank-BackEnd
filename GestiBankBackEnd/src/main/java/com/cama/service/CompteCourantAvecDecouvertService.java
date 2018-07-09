package com.cama.service;

import java.util.List;

import com.cama.model.CompteCourantAvecDecouvert;

public interface CompteCourantAvecDecouvertService {

	List<CompteCourantAvecDecouvert> findAllComptes();
	
	CompteCourantAvecDecouvert findCompteById(int id);
	
	void createCompte(CompteCourantAvecDecouvert compte);

	void deleteCompte(CompteCourantAvecDecouvert compte);
	
	void updateCompte(CompteCourantAvecDecouvert compte);
}