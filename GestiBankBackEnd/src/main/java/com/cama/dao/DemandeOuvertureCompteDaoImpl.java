package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeOuvertureCompte;

@Repository("demandeOuvertureCompteDao")
public class DemandeOuvertureCompteDaoImpl extends AbstractDao<Integer, DemandeOuvertureCompte> implements DemandeOuvertureCompteDao {

	@Override
	public List<DemandeOuvertureCompte> findAllDemandesComptes() {
		String requete = "select d " + "from DemandeOuvertureCompte as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<DemandeOuvertureCompte>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public DemandeOuvertureCompte findDemandeCompteById(int id) {
		String requete = "select d " + "from DemandeOuvertureCompte as d " + "where d.idDemande = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (DemandeOuvertureCompte) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		save(demandeCompte);
	}

	@Override
	public void deleteDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		delete(getByKey((int) demandeCompte.getIdDemande()));
	}

	@Override
	public void updateDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		update(demandeCompte);
	}
}