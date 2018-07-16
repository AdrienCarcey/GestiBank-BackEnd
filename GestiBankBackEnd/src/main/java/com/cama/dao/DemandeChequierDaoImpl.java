package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeChequier;

@Repository("demandeChequierDao")
public class DemandeChequierDaoImpl extends AbstractDao<Integer, DemandeChequier> implements DemandeChequierDao {

	@Override
	public List<DemandeChequier> findAllDemandesClients() {
		String requete = "select d " + "from DemandeChequier as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<DemandeChequier>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public DemandeChequier findDemandeClientById(int id) {
		return getByKey(id);
	}

	@Override
	public void createDemandeClient(DemandeChequier demandeClient) {
		save(demandeClient);
	}

	@Override
	public void deleteDemandeClient(DemandeChequier demandeClient) {
		delete(getByKey((int) demandeClient.getIdDemande()));
	}

	@Override
	public void updateDemandeClient(DemandeChequier demandeClient) {
		update(demandeClient);
	}
}