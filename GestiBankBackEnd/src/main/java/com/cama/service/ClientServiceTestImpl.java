package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ClientDaoTest;
import com.cama.model.ClientTest;
import com.cama.model.CompteTest;

@Service("clientServiceTest")
@Transactional
public class ClientServiceTestImpl implements ClientServiceTest {
	
	@Autowired
	private ClientDaoTest clientDAOTest;
	
	@Override
	public List<ClientTest> findAllClients() {
		return clientDAOTest.findAllClients();
	}

	@Override
	public ClientTest findClientById(int idClient) {
		return clientDAOTest.findClientById(idClient);
	}

	@Override
	public Boolean createClient(ClientTest client) {
		clientDAOTest.createClient(client);
		return true;
	}

	@Override
	public Boolean deleteClientById(int idClient) {
		if(findClientById(idClient) == null) {
			return false;
		}
		else {
			clientDAOTest.deleteClient(findClientById(idClient));
			return true;
		}
	}

	@Override
	public Boolean updateClientById(int idClient, ClientTest client) {
		if(findClientById(idClient) == null) {
			return false;
		}
		else {
			ClientTest clientUpdate = findClientById(idClient);
			clientUpdate.setFirstName(client.getFirstName());
			clientUpdate.setLastName(client.getLastName());
			clientUpdate.setEmail(client.getEmail());
			clientUpdate.setMobile(client.getMobile());
			clientDAOTest.updateClient(clientUpdate);
			return true;
		}
	}

	@Override
	public Boolean createCompte(int idClient, CompteTest compte) {
		if(findClientById(idClient) == null) {
			return false;
		}
		else {
			ClientTest clientUpdate = findClientById(idClient);
			clientUpdate.getComptes().add(compte);
			clientDAOTest.updateClient(clientUpdate);
			return true;
		}
	}

	@Override
	public Boolean deleteCompteById(int idCompte) {
		return null;
	}
}