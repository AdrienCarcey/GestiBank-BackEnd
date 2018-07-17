package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeFermetureCompte;

@Repository("demandeFermetureCompteDao")
public class DemandeFermetureCompteDaoImpl extends AbstractDao<Integer, DemandeFermetureCompte> implements DemandeFermetureCompteDao {

	@Override
	public List<DemandeFermetureCompte> findAllDemandesComptes() {
		String requete = "select d " + "from DemandeFermetureCompte as d";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<DemandeFermetureCompte>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public DemandeFermetureCompte findDemandeCompteById(int id) {
		String requete = "select d " + "from DemandeFermetureCompte as d " + "where d.idDemande = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (DemandeFermetureCompte) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createDemandeCompte(DemandeFermetureCompte demandeCompte) {
		save(demandeCompte);
	}

	@Override
	public void deleteDemandeCompte(DemandeFermetureCompte demandeCompte) {
		delete(getByKey((int) demandeCompte.getIdDemande()));
	}

	@Override
	public void updateDemandeCompte(DemandeFermetureCompte demandeCompte) {
		update(demandeCompte);
	}
}