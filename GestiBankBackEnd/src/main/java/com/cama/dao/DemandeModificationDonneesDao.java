package com.cama.dao;

import java.util.List;

import com.cama.model.DemandeModificationDonnees;

public interface DemandeModificationDonneesDao {

	List<DemandeModificationDonnees> findAllDemandesClients();
	
	DemandeModificationDonnees findDemandeClientById(int id);
	
	void createDemandeClient(DemandeModificationDonnees demandeClient);

	void deleteDemandeClient(DemandeModificationDonnees demandeClient);
	
	void updateDemandeClient(DemandeModificationDonnees demandeClient);
}