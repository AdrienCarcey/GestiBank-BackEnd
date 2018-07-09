package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.CompteCourantAvecDecouvert;
import com.cama.model.SituationFamiliale;

@Repository("situationFamilialeDao")
public class SituationFamilialeDaoImpl extends AbstractDao<Integer, SituationFamiliale> implements SituationFamilialeDao {

	@Override
	@Transactional
	public List<SituationFamiliale> findAllSituationsFamiliales() {
		String requete = "select s " + "from SituationFamiliale as s";
		Query query = getEntityManager().createQuery(requete);
		return (List<SituationFamiliale>) query.getResultList();
	}

	@Override
	@Transactional
	public SituationFamiliale findSituationFamilialeById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createSituationFamiliale(SituationFamiliale situationFamiliale) {
		save(situationFamiliale);
	}

	@Override
	@Transactional
	public void deleteSituationFamiliale(SituationFamiliale situationFamiliale) {
		delete(getByKey((int) situationFamiliale.getIdSituationFamiliale()));
	}

	@Override
	@Transactional
	public void updateSituationFamiliale(SituationFamiliale situationFamiliale) {
		update(situationFamiliale);
	}
}