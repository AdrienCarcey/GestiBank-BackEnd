package com.cama.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cama.model.ClientTest;

public interface ClientControllerTest {
	
	ResponseEntity<List<ClientTest>> findAllClients();
	
	ResponseEntity<ClientTest> findClientById(int id);
	
	ResponseEntity<Boolean> createClient(ClientTest client);
	
	ResponseEntity<Boolean> deleteClientById(int id);
	
	ResponseEntity<Boolean> updateClientById(int id, ClientTest client);
}