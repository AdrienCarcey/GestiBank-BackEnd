package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeInscription;

@Repository("demandeInscriptionDao")
public class DemandeInscriptionDaoImpl extends AbstractDao<Integer, DemandeInscription> implements DemandeInscriptionDao {

	@Override
	public List<DemandeInscription> findAllDemandesInscriptions() {
		String requete = "select d " + "from DemandeInscription as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<DemandeInscription>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public DemandeInscription findDemandeInscriptionById(int id) {
		String requete = "select d " + "from DemandeInscription as d " + "where d.idDemande = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (DemandeInscription) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
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