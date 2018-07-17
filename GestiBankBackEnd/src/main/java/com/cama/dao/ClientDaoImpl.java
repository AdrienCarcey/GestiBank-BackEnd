package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Client;

@Repository("clientDao")
public class ClientDaoImpl extends AbstractDao<Integer, Client> implements ClientDao {

	@Override
	public List<Client> findAllClients() {
		String requete = "select c " + "from Client as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<Client>) query.getResultList();	
		} catch (NoResultException e) {
			return null;
		}
		
	}

	@Override
	public Client findClientById(int id) {
		String requete = "select c " + "from Client as c " + "where c.idUtilisateur = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (Client) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}		
	}

	@Override
	public Client findClientByName(String name) {
        String requete = "select c " + "from Client as c " + "where c.nomUtilisateur = :nomClient AND c.statut = 'ouvert'";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("nomClient", name);
        try {
        	return (Client) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}    
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