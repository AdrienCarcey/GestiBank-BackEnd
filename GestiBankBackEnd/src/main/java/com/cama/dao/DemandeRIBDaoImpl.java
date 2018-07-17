package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeRIB;

@Repository("demandeRIBDao")
public class DemandeRIBDaoImpl extends AbstractDao<Integer, DemandeRIB> implements DemandeRIBDao {

	@Override
	public List<DemandeRIB> findAllDemandesClients() {
		String requete = "select d " + "from DemandeRIB as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<DemandeRIB>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public DemandeRIB findDemandeClientById(int id) {
		String requete = "select d " + "from DemandeRIB as d " + "where d.idDemande = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (DemandeRIB) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createDemandeClient(DemandeRIB demandeClient) {
		save(demandeClient);
	}

	@Override
	public void deleteDemandeClient(DemandeRIB demandeClient) {
		delete(getByKey((int) demandeClient.getIdDemande()));
	}

	@Override
	public void updateDemandeClient(DemandeRIB demandeClient) {
		update(demandeClient);
	}
}