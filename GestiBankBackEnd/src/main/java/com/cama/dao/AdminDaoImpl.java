package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends AbstractDao<Integer, Admin> implements AdminDao {

	@Override
	@Transactional
	public List<Admin> findAllAdmins() {
		String requete = "select u " + "from Utilisateur as u " + "where u.heritage = 'admin'";
		Query query = getEntityManager().createQuery(requete);
		return (List<Admin>) query.getResultList();
	}

	@Override
	@Transactional
	public Admin findAdminById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createAdmin(Admin admin) {
		save(admin);
	}

	@Override
	@Transactional
	public void deleteAdmin(Admin admin) {
		delete(getByKey((int) admin.getIdUtilisateur()));
	}

	@Override
	@Transactional
	public void updateAdmin(Admin admin) {
		update(admin);
	}
}