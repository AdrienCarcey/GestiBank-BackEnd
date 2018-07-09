package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ClientDaoTest;
import com.cama.model.ClientTest;

@Service("clientServiceTest")
public class ClientServiceTestImpl implements ClientServiceTest {
	
	@Autowired
	private ClientDaoTest clientDAOTest;
	
	@Override
	public List<ClientTest> findAllClients() {
		return clientDAOTest.findAllClients();
	}

	@Override
	public ClientTest findClientById(int id) {
		return clientDAOTest.findClientById(id);
	}

	@Override
	public void createClient(ClientTest client) {
		clientDAOTest.createClient(client);
	}

	@Override
	public void deleteClient(ClientTest client) {
		clientDAOTest.deleteClient(client);
	}

	@Override
	public void updateClient(ClientTest client) {
		clientDAOTest.updateClient(client);
	}
}