package com.cama.service;

import java.util.List;

import com.cama.model.ClientTest;
import com.cama.model.CompteTest;

public interface ClientServiceTest {
	
	List<ClientTest> findAllClients();
	
	ClientTest findClientById(int idClient);
	
	Boolean createClient(ClientTest client);

	Boolean deleteClientById(int idClient);
	
	Boolean updateClientById(int idClient, ClientTest client);
	
	Boolean createCompte(int idClient, CompteTest compte);
	
	Boolean deleteCompteById(int idCompte);
	
	Boolean deleteCompteById(int idClient, int idCompte);
}