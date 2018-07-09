package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteRemunerateur;

@Repository("compteRemunerateurDao")
public class CompteRemunerateurDaoImpl extends AbstractDao<Integer, CompteRemunerateur> implements CompteRemunerateurDao {

	@Override
	@Transactional
	public List<CompteRemunerateur> findAllComptes() {
		String requete = "select c " + "from Compte as c " + "where c.heritage = 'compteRemunerateur'";
		Query query = getEntityManager().createQuery(requete);
		return (List<CompteRemunerateur>) query.getResultList();
	}

	@Override
	@Transactional
	public CompteRemunerateur findCompteById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createCompte(CompteRemunerateur compte) {
		save(compte);
	}

	@Override
	@Transactional
	public void deleteCompte(CompteRemunerateur compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	@Transactional
	public void updateCompte(CompteRemunerateur compte) {
		update(compte);
	}
}