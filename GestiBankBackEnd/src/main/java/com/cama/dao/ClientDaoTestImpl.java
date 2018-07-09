package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.ClientTest;

@Repository("clientDaoTest")
public class ClientDaoTestImpl extends AbstractDao<Integer, ClientTest> implements ClientDaoTest {

	@Override
	@Transactional
	public List<ClientTest> findAllClients() {
		String requete = "select c " + "from ClientTest as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<ClientTest>) query.getResultList();
	}

	@Override
	@Transactional
	public ClientTest findClientById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createClient(ClientTest client) {
		save(client);
	}

	@Override
	@Transactional
	public void deleteClient(ClientTest client) {
		delete(getByKey((int) client.getIdClient()));
	}
	
	@Override
	@Transactional
	public void updateClient(ClientTest client) {
		update(client);
	}
}