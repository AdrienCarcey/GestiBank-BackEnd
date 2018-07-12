package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Identite;

@Repository("identiteDao")
public class IdentiteDaoImpl extends AbstractDao<Integer, Identite> implements IdentiteDao {

	@Override
	public List<Identite> findAllIdentites() {
		String requete = "select i " + "from Identite as i";
		Query query = getEntityManager().createQuery(requete);
		return (List<Identite>) query.getResultList();
	}

	@Override
	public Identite findIdentiteById(int id) {
		return getByKey(id);
	}

	@Override
	public void createIdentite(Identite identite) {
		save(identite);
	}

	@Override
	public void deleteIdentite(Identite identite) {
		delete(getByKey((int) identite.getIdIdentite()));
	}

	@Override
	public void updateIdentite(Identite identite) {
		update(identite);
	}
}