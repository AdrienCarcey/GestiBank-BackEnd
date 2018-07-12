package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeRIB;

@Repository("demandeRIBDao")
public class DemandeRIBDaoImpl extends AbstractDao<Integer, DemandeRIB> implements DemandeRIBDao {

	@Override
	public List<DemandeRIB> findAllDemandesClients() {
		String requete = "select d " + "from DemandeRIB as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeRIB>) query.getResultList();
	}

	@Override
	public DemandeRIB findDemandeClientById(int id) {
		return getByKey(id);
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