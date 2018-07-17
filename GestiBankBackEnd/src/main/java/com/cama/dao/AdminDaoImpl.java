package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Admin;

@Repository("adminDao")
public class AdminDaoImpl extends AbstractDao<Integer, Admin> implements AdminDao {

	@Override
	public List<Admin> findAllAdmins() {
		String requete = "select a " + "from Admin as a";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<Admin>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}				
	}

	@Override
	public Admin findAdminById(int id) {
		String requete = "select a " + "from Admin as a " + "where c.idUtilisateur = :id";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("id", id);
        try {
        	return (Admin) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}		
	}

	@Override
    public Admin findAdminByName(String name) {
        String requete = "select a " + "from Admin as a " + "where a.nomUtilisateur = :nomAdmin AND a.statut = 'ouvert'\"";
        Query query = getEntityManager().createQuery(requete);
        query.setParameter("nomAdmin", name);
        try {
        	return (Admin) query.getSingleResult();	
		} catch (NoResultException e) {
			return null;
		}
        
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