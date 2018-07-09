package com.cama.service;

import java.util.List;

import com.cama.model.CompteCourantSansDecouvert;

public interface CompteCourantSansDecouvertService {

	List<CompteCourantSansDecouvert> findAllComptes();
	
	CompteCourantSansDecouvert findCompteById(int id);
	
	void createCompte(CompteCourantSansDecouvert compte);

	void deleteCompte(CompteCourantSansDecouvert compte);
	
	void updateCompte(CompteCourantSansDecouvert compte);
}