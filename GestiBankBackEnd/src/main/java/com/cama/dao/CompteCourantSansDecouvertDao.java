package com.cama.dao;

import java.util.List;

import com.cama.model.CompteCourantSansDecouvert;

public interface CompteCourantSansDecouvertDao {

	List<CompteCourantSansDecouvert> findAllComptes();
	
	CompteCourantSansDecouvert findCompteById(int id);
	
	void createCompte(CompteCourantSansDecouvert compte);

	void deleteCompte(CompteCourantSansDecouvert compte);
	
	void updateCompte(CompteCourantSansDecouvert compte);
}