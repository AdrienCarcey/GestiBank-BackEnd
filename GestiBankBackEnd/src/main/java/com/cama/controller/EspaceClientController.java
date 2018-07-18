package com.cama.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.DemandeChequier;
import com.cama.model.DemandeRIB;
import com.cama.model.MessageClient;
import com.cama.model.OperationBancaire;

public interface EspaceClientController {
	
	ResponseEntity<List<Compte>> findComptesById(int idClient);
	
	ResponseEntity<List<OperationBancaire>> findOperationsById(int id);
	
	ResponseEntity<Boolean> createMessageClient(MessageClient messageClient);
	
	ResponseEntity<Client> getClientById(int idClient);
	
	ResponseEntity<Boolean> createDemandeChequier(DemandeChequier demandeChequier, int idClient);
	
	ResponseEntity<Boolean> createDemandeRib(DemandeRIB demandeRib, int idClient);
}
