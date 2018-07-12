package com.cama.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.ClientTest;
import com.cama.model.CompteTest;

public interface ClientControllerTest {
	
	ResponseEntity<List<ClientTest>> findAllClients();
	
	ResponseEntity<ClientTest> findClientById(int idClient);
	
	ResponseEntity<Boolean> createClient(ClientTest client);
	
	ResponseEntity<Boolean> deleteClientById(int idClient);
	
	ResponseEntity<Boolean> updateClientById(int idClient, ClientTest client);
	
	ResponseEntity<Boolean> createCompte(int idClient, CompteTest compte);
	
	ResponseEntity<Boolean> deleteCompteById(int idCompte);
	
	ResponseEntity<Boolean> deleteCompteById(int idClient, int idCompte);
	
	ResponseEntity<Boolean> updateCompteById(int idCompte, CompteTest compte);
}