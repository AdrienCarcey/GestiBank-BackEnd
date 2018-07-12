package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Client;

@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao<Integer, Client> implements ClientDao {

	@Override
	public List<Client> findAllClients() {
		String requete = "select c " + "from Client as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<Client>) query.getResultList();
	}

	@Override
	public Client findClientById(int id) {
		return getByKey(id);
	}

	@Override
	public void createClient(Client client) {
		save(client);
	}

	@Override
	public void deleteClient(Client client) {
		delete(getByKey((int) client.getIdUtilisateur()));
	}

	@Override
	public void updateClient(Client client) {
		update(client);
	}
}