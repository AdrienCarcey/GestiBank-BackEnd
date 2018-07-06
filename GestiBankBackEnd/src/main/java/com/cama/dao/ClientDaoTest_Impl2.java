package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.ClientTest;

@Repository("clientDaoTest")
public class ClientDaoTest_Impl2 extends AbstractDao<Integer, ClientTest> implements ClientDaoTest {

	@Override
	public List<ClientTest> findAllClients() {
		String requete = "select c " + "from ClientTest as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<ClientTest>) query.getResultList();
	}

	@Override
	public ClientTest findClientById(int id) {
		return getByKey(id);
	}

	@Override
	public void createClient(ClientTest client) {
		persist(client);	
	}

	@Override
	public void deleteClient(ClientTest client) {
		delete(client);	
	}
	
	@Override
	public void updateClient(ClientTest client) {
		update(client);	
	}
}