package com.cama.dao;

import java.util.List;

import com.cama.model.Contact;

public interface ContactDao {

	List<Contact> findAllContacts();
	
	Contact findContactById(int id);
	
	void createContact(Contact contact);

	void deleteContact(Contact contact);
	
	void updateContact(Contact contact);
}