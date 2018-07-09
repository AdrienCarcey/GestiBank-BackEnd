package com.cama.service;

import java.util.List;

import com.cama.model.DemandeModificationDonnees;

public interface DemandeModificationDonneesService {

	List<DemandeModificationDonnees> findAllDemandesClients();
	
	DemandeModificationDonnees findDemandeClientById(int id);
	
	void createDemandeClient(DemandeModificationDonnees demandeClient);

	void deleteDemandeClient(DemandeModificationDonnees demandeClient);
	
	void updateDemandeClient(DemandeModificationDonnees demandeClient);
}