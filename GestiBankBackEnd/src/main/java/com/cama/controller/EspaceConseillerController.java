package com.cama.controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.Demande;
import com.cama.model.OperationBancaire;

public interface EspaceConseillerController {
	
	ResponseEntity<List<Client>> findAllClients(int idConseiller);
	
	ResponseEntity<Client> findClientAccount(int idClient);
	
	ResponseEntity<Boolean> openClientAccount(int idClient);
	
	ResponseEntity<Boolean> closeClientAccount(int idClient);
	
	ResponseEntity<Boolean> updateClientAccount(int idClient, Client client);
	
	ResponseEntity<Compte> findClientCompte(int idCompte);
	
	ResponseEntity<Boolean> openClientCompte(int idCompte);
	
	ResponseEntity<Boolean> closeClientCompte(int idCompte);
	
	ResponseEntity<List<OperationBancaire>> findCompteOperation (int idCompte);
	
	ResponseEntity<Hashtable<String, List>> findAllDemandes(int idConseiller);
	
	ResponseEntity<Boolean> validateDemande(int idDemande, String typeDemande);
	
	ResponseEntity<Boolean> refuseDemande(int idDemande);
}
