package com.cama.dao;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cama.model.Contact;

@Repository("contact")
public class ContactDaoImpl extends AbstractDao<Integer, Contact> implements ContactDao {

	@Override
	public List<Contact> findAllContacts() {
		String requete = "select c " + "from Contact as c";
		Query query = getEntityManager().createQuery(requete);
		try {
			return (List<Contact>) query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public Contact findContactById(int id) {
		try {
			return getByKey(id);
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void createContact(Contact contact) {
		save(contact);
	}

	@Override
	public void deleteContact(Contact contact) {
		delete(getByKey((int) contact.getIdContact()));
	}

	@Override
	public void updateContact(Contact contact) {
		update(contact);
	}
}