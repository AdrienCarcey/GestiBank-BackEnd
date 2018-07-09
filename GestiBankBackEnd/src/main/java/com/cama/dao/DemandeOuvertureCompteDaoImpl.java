package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.DemandeOuvertureCompte;

@Repository("demandeOuvertureCompteDao")
public class DemandeOuvertureCompteDaoImpl extends AbstractDao<Integer, DemandeOuvertureCompte> implements DemandeOuvertureCompteDao {

	@Override
	@Transactional
	public List<DemandeOuvertureCompte> findAllDemandesComptes() {
		String requete = "select d " + "from Demande as d " + "where d.heritage = 'demandeOuvertureCompte'";
		Query query = getEntityManager().createQuery(requete);
		return (List<DemandeOuvertureCompte>) query.getResultList();
	}

	@Override
	@Transactional
	public DemandeOuvertureCompte findDemandeCompteById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		save(demandeCompte);
	}

	@Override
	@Transactional
	public void deleteDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		delete(getByKey((int) demandeCompte.getIdDemande()));
	}

	@Override
	@Transactional
	public void updateDemandeCompte(DemandeOuvertureCompte demandeCompte) {
		update(demandeCompte);
	}
}