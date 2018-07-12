package com.cama.dao;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends AbstractDao<Integer, Admin> implements AdminDao {

	@Override
	public List<Admin> findAllAdmins() {
		String requete = "select a " + "from Admin as a";
		Query query = getEntityManager().createQuery(requete);
		return (List<Admin>) query.getResultList();
	}

	@Override
	public Admin findAdminById(int id) {
		return getByKey(id);
	}

	@Override
	public void createAdmin(Admin admin) {
		save(admin);
	}

	@Override
	public void deleteAdmin(Admin admin) {
		delete(getByKey((int) admin.getIdUtilisateur()));
	}

	@Override
	public void updateAdmin(Admin admin) {
		update(admin);
	}
}