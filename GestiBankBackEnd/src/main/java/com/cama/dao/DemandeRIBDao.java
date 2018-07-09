package com.cama.dao;

import java.util.List;

import com.cama.model.DemandeRIB;

public interface DemandeRIBDao {

	List<DemandeRIB> findAllDemandesClients();
	
	DemandeRIB findDemandeClientById(int id);
	
	void createDemandeClient(DemandeRIB demandeClient);

	void deleteDemandeClient(DemandeRIB demandeClient);
	
	void updateDemandeClient(DemandeRIB demandeClient);
}