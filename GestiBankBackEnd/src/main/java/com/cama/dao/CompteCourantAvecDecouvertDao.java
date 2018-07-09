package com.cama.dao;

import java.util.List;

import com.cama.model.CompteCourantAvecDecouvert;

public interface CompteCourantAvecDecouvertDao {

	List<CompteCourantAvecDecouvert> findAllComptes();
	
	CompteCourantAvecDecouvert findCompteById(int id);
	
	void createCompte(CompteCourantAvecDecouvert compte);

	void deleteCompte(CompteCourantAvecDecouvert compte);
	
	void updateCompte(CompteCourantAvecDecouvert compte);
}