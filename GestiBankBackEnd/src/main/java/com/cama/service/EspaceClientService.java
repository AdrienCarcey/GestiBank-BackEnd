package com.cama.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.MessageClient;
import com.cama.model.OperationBancaire;

public interface EspaceClientService {
	
	List<Compte> findComptesById(int idClient);
	
	List<OperationBancaire> findOperationsById(int idCompte);

	Boolean createMessageClient(MessageClient messageClient);

	Client getClientById(int idClient);

}
