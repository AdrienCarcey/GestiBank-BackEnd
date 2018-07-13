package com.cama.dao;

import java.util.List;

import com.cama.model.Client;

public interface ClientDao {
	
	List<Client> findAllClients();
	
	Client findClientById(int id);
	
	Client findClientByName(String name);
	
	void createClient(Client client);

	void deleteClient(Client client);
	
	void updateClient(Client client);
}