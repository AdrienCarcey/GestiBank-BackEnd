package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeInscription;

@Repository("demandeInscriptionDao")
public class DemandeInscriptionDaoImpl extends AbstractDao<Integer, DemandeInscription> implements DemandeInscriptionDao {

	@Override
	public List<DemandeInscription> findAllDemandesInscriptions() {
		String requete = "select d " + "from DemandeInscription as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeInscription>) query.getResultList();
	}

	@Override
	public DemandeInscription findDemandeInscriptionById(int id) {
		return getByKey(id);
	}

	@Override
	public void createDemandeInscription(DemandeInscription demandeInscription) {
		save(demandeInscription);
	}

	@Override
	public void deleteDemandeInscription(DemandeInscription demandeInscription) {
		delete(getByKey((int) demandeInscription.getIdDemande()));
	}

	@Override
	public void updateDemandeInscription(DemandeInscription demandeInscription) {
		update(demandeInscription);
	}
}