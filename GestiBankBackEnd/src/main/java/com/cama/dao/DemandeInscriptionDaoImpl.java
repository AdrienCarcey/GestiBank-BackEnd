package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeInscription;

@Repository("demandeInscriptionDao")
public class DemandeInscriptionDaoImpl extends AbstractDao<Integer, DemandeInscription> implements DemandeInscriptionDao {

	@Override
	@Transactional
	public List<DemandeInscription> findAllDemandesInscriptions() {
		String requete = "select d " + "from Demande as d " + "where d.heritage = 'demandeInscription'";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeInscription>) query.getResultList();
	}

	@Override
	@Transactional
	public DemandeInscription findDemandeInscriptionById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDemandeInscription(DemandeInscription demandeInscription) {
		save(demandeInscription);
	}

	@Override
	@Transactional
	public void deleteDemandeInscription(DemandeInscription demandeInscription) {
		delete(getByKey((int) demandeInscription.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateDemandeInscription(DemandeInscription demandeInscription) {
		update(demandeInscription);
	}
}