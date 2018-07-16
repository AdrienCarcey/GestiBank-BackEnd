package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.ClientTest;

@Repository("clientDaoTest")
public class ClientDaoTestImpl extends AbstractDao<Integer, ClientTest> implements ClientDaoTest {

	@Override
	public List<ClientTest> findAllClients() {
		String requete = "select c " + "from ClientTest as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<ClientTest>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public ClientTest findClientById(int idClient) {
		return getByKey(idClient);
	}

	@Override
	public void createClient(ClientTest client) {
		save(client);
	}

	@Override
	public void deleteClient(ClientTest client) {
		delete(getByKey((int) client.getIdClient()));
	}
	
	@Override
	public void updateClient(ClientTest client) {
		update(client);
	}
}