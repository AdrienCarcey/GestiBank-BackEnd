package com.cama.service;

import java.util.List;

import com.cama.model.ClientTest;

public interface ClientServiceTest {
	
	List<ClientTest> findAllClients();
	
	ClientTest findClientById(int id);
	
	void createClient(ClientTest client);

	void deleteClient(ClientTest client);
	
	void updateClient(ClientTest client);
}