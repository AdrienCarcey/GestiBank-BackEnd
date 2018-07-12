package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeFermetureCompte;

@Repository("demandeFermetureCompteDao")
public class DemandeFermetureCompteDaoImpl extends AbstractDao<Integer, DemandeFermetureCompte> implements DemandeFermetureCompteDao {

	@Override
	public List<DemandeFermetureCompte> findAllDemandesComptes() {
		String requete = "select d " + "from DemandeFermetureCompte as d";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeFermetureCompte>) query.getResultList();
	}

	@Override
	public DemandeFermetureCompte findDemandeCompteById(int id) {
		return getByKey(id);
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