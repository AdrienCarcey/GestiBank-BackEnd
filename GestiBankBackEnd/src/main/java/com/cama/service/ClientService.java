package com.cama.service;

import java.util.List;

import com.cama.model.Client;

public interface ClientService {

	List<Client> findAllClients();
	
	Client findClientById(int id);
	
	void createClient(Client client);

	void deleteClient(Client client);
	
	void updateClient(Client client);
}