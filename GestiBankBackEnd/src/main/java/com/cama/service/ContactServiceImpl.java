package com.cama.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cama.dao.ContactDao;
import com.cama.model.Contact;

@Service("contactService")
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDAO;
	
	@Override
	public List<Contact> findAllContacts() {
		return contactDAO.findAllContacts();
	}

	@Override
	public Contact findContactById(int id) {
		return contactDAO.findContactById(id);
	}

	@Override
	public void createContact(Contact contact) {
		contactDAO.createContact(contact);
	}

	@Override
	public void deleteContact(Contact contact) {
		contactDAO.deleteContact(contact);
	}

	@Override
	public void updateContact(Contact contact) {
		contactDAO.updateContact(contact);
	}
}