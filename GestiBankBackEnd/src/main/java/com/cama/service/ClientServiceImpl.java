package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ClientDao;
import com.cama.model.Client;

@Service("clientService")
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDao clientDAO;
	
	@Override
	public List<Client> findAllClients() {
		return clientDAO.findAllClients();
	}

	@Override
	public Client findClientById(int id) {
		return clientDAO.findClientById(id);
	}

	@Override
	public void createClient(Client client) {
		clientDAO.createClient(client);
	}

	@Override
	public void deleteClient(Client client) {
		clientDAO.deleteClient(client);
	}

	@Override
	public void updateClient(Client client) {
		clientDAO.updateClient(client);
	}
}