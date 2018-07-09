package com.cama.service;

import java.util.List;

import com.cama.model.DemandeRIB;

public interface DemandeRIBService {
	
	List<DemandeRIB> findAllDemandesClients();
	
	DemandeRIB findDemandeClientById(int id);
	
	void createDemandeClient(DemandeRIB demandeClient);

	void deleteDemandeClient(DemandeRIB demandeClient);
	
	void updateDemandeClient(DemandeRIB demandeClient);
}