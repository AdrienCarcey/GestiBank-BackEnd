package com.cama.service;

import java.util.List;

import com.cama.model.DemandeFermetureCompte;

public interface DemandeFermetureCompteService {

	List<DemandeFermetureCompte> findAllDemandesComptes();
	
	DemandeFermetureCompte findDemandeCompteById(int id);
	
	void createDemandeCompte(DemandeFermetureCompte demandeCompte);

	void deleteDemandeCompte(DemandeFermetureCompte demandeCompte);
	
	void updateDemandeCompte(DemandeFermetureCompte demandeCompte);
}