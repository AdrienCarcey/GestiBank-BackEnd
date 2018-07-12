package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.SituationFamiliale;

@Repository("situationFamilialeDao")
public class SituationFamilialeDaoImpl extends AbstractDao<Integer, SituationFamiliale> implements SituationFamilialeDao {

	@Override
	public List<SituationFamiliale> findAllSituationsFamiliales() {
		String requete = "select s " + "from SituationFamiliale as s";
		Query query = getEntityManager().createQuery(requete);
		return (List<SituationFamiliale>) query.getResultList();
	}

	@Override
	public SituationFamiliale findSituationFamilialeById(int id) {
		return getByKey(id);
	}

	@Override
	public void createSituationFamiliale(SituationFamiliale situationFamiliale) {
		save(situationFamiliale);
	}

	@Override
	public void deleteSituationFamiliale(SituationFamiliale situationFamiliale) {
		delete(getByKey((int) situationFamiliale.getIdSituationFamiliale()));
	}

	@Override
	public void updateSituationFamiliale(SituationFamiliale situationFamiliale) {
		update(situationFamiliale);
	}
}