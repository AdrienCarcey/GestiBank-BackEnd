package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Conseiller;

@Repository("conseillerDao")
public class ConseillerDaoImpl extends AbstractDao<Integer, Conseiller> implements ConseillerDao {

	@Override
	public List<Conseiller> findAllConseillers() {
		String requete = "select c " + "from Conseiller as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<Conseiller>) query.getResultList();
	}

	@Override
	public Conseiller findConseillerById(int id) {
		return getByKey(id);
	}
	
	@Override
    public Conseiller findConseillerByName(String name) {
        String requete = "select c " + "from Conseiller as c " + "where c.nomUtilisateur = :nomConseiller";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("nomConseiller", name);
        return (Conseiller) query.getSingleResult();
    }

	@Override
	public void createConseiller(Conseiller conseiller) {
		save(conseiller);
	}

	@Override
	public void deleteConseiller(Conseiller conseiller) {
		delete(getByKey((int) conseiller.getIdUtilisateur()));
	}

	@Override
	public void updateConseiller(Conseiller conseiller) {
		update(conseiller);
	}
}