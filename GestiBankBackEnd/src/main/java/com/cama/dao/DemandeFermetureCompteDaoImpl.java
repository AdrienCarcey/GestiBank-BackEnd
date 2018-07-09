package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeFermetureCompte;

@Repository("demandeFermetureCompteDao")
public class DemandeFermetureCompteDaoImpl extends AbstractDao<Integer, DemandeFermetureCompte> implements DemandeFermetureCompteDao {

	@Override
	@Transactional
	public List<DemandeFermetureCompte> findAllDemandesComptes() {
		String requete = "select d " + "from Demande as d " + "where d.heritage = 'demandeFermetureCompte'";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeFermetureCompte>) query.getResultList();
	}

	@Override
	@Transactional
	public DemandeFermetureCompte findDemandeCompteById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDemandeCompte(DemandeFermetureCompte demandeCompte) {
		save(demandeCompte);
	}

	@Override
	@Transactional
	public void deleteDemandeCompte(DemandeFermetureCompte demandeCompte) {
		delete(getByKey((int) demandeCompte.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateDemandeCompte(DemandeFermetureCompte demandeCompte) {
		update(demandeCompte);
	}
}