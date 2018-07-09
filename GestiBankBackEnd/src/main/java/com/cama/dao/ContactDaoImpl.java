package com.cama.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cama.model.Contact;

@Repository("contact")
public class ContactDaoImpl extends AbstractDao<Integer, Contact> implements ContactDao {

	@Override
	@Transactional
	public List<Contact> findAllContacts() {
		String requete = "select c " + "from Contact as c";
		Query query = getEntityManager().createQuery(requete);
		return (List<Contact>) query.getResultList();
	}

	@Override
	@Transactional
	public Contact findContactById(int id) {
		return getByKey(id);
	}

	@Override
	@Transactional
	public void createContact(Contact contact) {
		save(contact);
	}

	@Override
	@Transactional
	public void deleteContact(Contact contact) {
		delete(getByKey((int) contact.getIdContact()));
	}

	@Override
	public void updateContact(Contact contact) {
		update(contact);
	}
}