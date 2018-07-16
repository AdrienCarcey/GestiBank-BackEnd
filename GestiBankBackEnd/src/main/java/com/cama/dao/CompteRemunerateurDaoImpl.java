package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteRemunerateur;

@Repository("compteRemunerateurDao")
public class CompteRemunerateurDaoImpl extends AbstractDao<Integer, CompteRemunerateur> implements CompteRemunerateurDao {

	@Override
	public List<CompteRemunerateur> findAllComptes() {
		String requete = "select c " + "from CompteRemunerateur as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<CompteRemunerateur>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public CompteRemunerateur findCompteById(int id) {
		return getByKey(id);
	}

	@Override
	public void createCompte(CompteRemunerateur compte) {
		save(compte);
	}

	@Override
	public void deleteCompte(CompteRemunerateur compte) {
		delete(getByKey((int) compte.getIdCompte()));
	}

	@Override
	public void updateCompte(CompteRemunerateur compte) {
		update(compte);
	}
}