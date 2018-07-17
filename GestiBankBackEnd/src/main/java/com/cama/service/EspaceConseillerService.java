package com.cama.service;

import java.util.List;

import com.cama.model.Client;
import com.cama.model.Compte;
import com.cama.model.Demande;
import com.cama.model.OperationBancaire;

public interface EspaceConseillerService {
	
	List<Client> findAllClients(int idConseiller);
	
	Client findClientAccount(int idClient);
	
	Boolean openClientAccount(int idClient);
	
	Boolean closeClientAccount(int idClient);
	
	Boolean updateClientAccount(int idClient, Client client);
	
	Compte findClientCompte(int idCompte);
	
	Boolean openClientCompte(int idCompte);
	
	Boolean closeClientCompte(int idCompte);
	
	List<OperationBancaire> findCompteOperation (int idCompte);
	
	List<Demande> findAllDemandes(int idConseiller);
	
	Boolean validateDemande(int idDemande, String typeDemande);
	
	Boolean refuseDemande(int idDemande);
}
