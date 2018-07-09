package com.cama.service;

import java.util.List;

import com.cama.model.DemandeChequier;

public interface DemandeChequierService {
	
	List<DemandeChequier> findAllDemandesClients();
	
	DemandeChequier findDemandeClientById(int id);
	
	void createDemandeClient(DemandeChequier demandeClient);

	void deleteDemandeClient(DemandeChequier demandeClient);
	
	void updateDemandeClient(DemandeChequier demandeClient);
}