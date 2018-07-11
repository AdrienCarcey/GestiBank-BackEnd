package com.cama.dao;

import java.util.List;

import com.cama.model.ClientTest;

public interface ClientDaoTest {
	
	List<ClientTest> findAllClients();
	
	ClientTest findClientById(int idClient);
	
	void createClient(ClientTest client);

	void deleteClient(ClientTest client);
	
	void updateClient(ClientTest client);
}