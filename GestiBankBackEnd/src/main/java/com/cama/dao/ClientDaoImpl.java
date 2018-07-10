package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.Client;

@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao<Integer, Client> implements ClientDao {

	@Override
	@Transactional
	public List<Client> findAllClients() {
		String requete = "select c " + "from Client as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<Client>) query.getResultList();
	}

	@Override
	@Transactional
	public Client findClientById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createClient(Client client) {
		save(client);
	}

	@Override
	@Transactional
	public void deleteClient(Client client) {
		delete(getByKey((int) client.getIdUtilisateur()));
	}

	@Override
	@Transactional
	public void updateClient(Client client) {
		update(client);
	}
}