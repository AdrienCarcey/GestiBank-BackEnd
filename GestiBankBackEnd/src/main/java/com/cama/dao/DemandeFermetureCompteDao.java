package com.cama.dao;

import java.util.List;

import com.cama.model.DemandeFermetureCompte;

public interface DemandeFermetureCompteDao {

	List<DemandeFermetureCompte> findAllDemandesComptes();
	
	DemandeFermetureCompte findDemandeCompteById(int id);
	
	void createDemandeCompte(DemandeFermetureCompte demandeCompte);

	void deleteDemandeCompte(DemandeFermetureCompte demandeCompte);
	
	void updateDemandeCompte(DemandeFermetureCompte demandeCompte);
}