package com.cama.dao;

import java.util.List;

import com.cama.model.CompteTest;

public interface CompteDaoTest {
	
	List<CompteTest> findAllComptes();
	
	CompteTest findCompteById(int idCompte);
	
	void createCompte(CompteTest compte);

	void deleteCompte(CompteTest compte);
	
	void updateCompte(CompteTest compte);
}