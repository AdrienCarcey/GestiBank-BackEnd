package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeChequier;
import com.cama.model.DemandeRIB;

@Repository("demandeRIBDao")
public class DemandeRIBDaoImpl extends AbstractDao<Integer, DemandeRIB> implements DemandeRIBDao {

	@Override
	@Transactional
	public List<DemandeRIB> findAllDemandesClients() {
		String requete = "select d " + "from Demande as d " + "where d.heritage = 'demandeRIB'";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeRIB>) query.getResultList();
	}

	@Override
	@Transactional
	public DemandeRIB findDemandeClientById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDemandeClient(DemandeRIB demandeClient) {
		save(demandeClient);
	}

	@Override
	@Transactional
	public void deleteDemandeClient(DemandeRIB demandeClient) {
		delete(getByKey((int) demandeClient.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateDemandeClient(DemandeRIB demandeClient) {
		update(demandeClient);
	}
}