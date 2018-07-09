package com.cama.service;

import java.util.List;

import com.cama.model.DemandeOuvertureCompte;

public interface DemandeOuvertureCompteService {

	List<DemandeOuvertureCompte> findAllDemandesComptes();
	
	DemandeOuvertureCompte findDemandeCompteById(int id);
	
	void createDemandeCompte(DemandeOuvertureCompte demandeCompte);

	void deleteDemandeCompte(DemandeOuvertureCompte demandeCompte);
	
	void updateDemandeCompte(DemandeOuvertureCompte demandeCompte);
}