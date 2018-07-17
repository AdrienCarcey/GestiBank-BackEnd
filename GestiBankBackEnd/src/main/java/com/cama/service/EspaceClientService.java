package com.cama.service;

import java.util.List;

import com.cama.model.Compte;
import com.cama.model.OperationBancaire;

public interface EspaceClientService {
	
	List<Compte> findComptesById(int idClient);
	
	List<OperationBancaire> findOperationsById(int idCompte);

}
