package com.cama.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ClientDaoTest;
import com.cama.dao.CompteDaoTest;
import com.cama.model.ClientTest;
import com.cama.model.CompteTest;

@Service("clientServiceTest")
@Transactional
public class ClientServiceTestImpl implements ClientServiceTest {
	
	@Autowired
	private ClientDaoTest clientDAOTest;
	@Autowired
	private CompteDaoTest compteDAOTest;
	
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
			
			if(client.getFirstName() != null) {
				clientUpdate.setFirstName(client.getFirstName());
			}
			if(client.getLastName() != null) {
				clientUpdate.setLastName(client.getLastName());
			}
			if(client.getEmail() != null) {
				clientUpdate.setEmail(client.getEmail());
			}
			if(client.getMobile() != null) {
				clientUpdate.setMobile(client.getMobile());
			}
			
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
	public Boolean deleteCompteByIdCompte(int idCompte) {
		if(compteDAOTest.findCompteById(idCompte) == null) {
			return false;
		}
		else {
			compteDAOTest.deleteCompte(compteDAOTest.findCompteById(idCompte));
			return true;
		}
	}

	@Override
	public Boolean deleteCompteByIdClient(int idClient, int idCompte) {
		if(findClientById(idClient) == null) {
			return false;
		}
		else {
			List<CompteTest> comptes = findClientById(idClient).getComptes();
			
			for(CompteTest compte: comptes) {
				if(compte.getIdCompte() == idCompte) {
					comptes.remove(compte);
					return true;
				}
			}
			
			return false;	
		}
	}

	@Override
	public Boolean updateCompteById(int idCompte, CompteTest compte) {
		if(compteDAOTest.findCompteById(idCompte) == null) {
			return false;
		}
		else {
			CompteTest compteUpdate = compteDAOTest.findCompteById(idCompte);
			
			if(compte.getDescription() != null) {
				compteUpdate.setDescription(compte.getDescription());
			}
			if(compte.getSolde() != 0) {
				compteUpdate.setSolde(compte.getSolde());
			}
			
			compteDAOTest.updateCompte(compteUpdate);
			return true;
		}
	}
}