package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeChequier;

@Repository("demandeChequierDao")
public class DemandeChequierDaoImpl extends AbstractDao<Integer, DemandeChequier> implements DemandeChequierDao {

	@Override
	@Transactional
	public List<DemandeChequier> findAllDemandesClients() {
		String requete = "select d " + "from DemandeChequier as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeChequier>) query.getResultList();
	}

	@Override
	@Transactional
	public DemandeChequier findDemandeClientById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDemandeClient(DemandeChequier demandeClient) {
		save(demandeClient);
	}

	@Override
	@Transactional
	public void deleteDemandeClient(DemandeChequier demandeClient) {
		delete(getByKey((int) demandeClient.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateDemandeClient(DemandeChequier demandeClient) {
		update(demandeClient);
	}
}