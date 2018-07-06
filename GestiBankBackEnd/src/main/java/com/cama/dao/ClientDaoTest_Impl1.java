package com.cama.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cama.model.ClientTest;
import com.cama.model.CompteTest;

//@Repository("clientDaoTest")
public class ClientDaoTest_Impl1 {
	
	//Fake DataBase
	private static List<CompteTest> comptes1;
	{
		comptes1 = new ArrayList<CompteTest>();
		comptes1.add(new CompteTest(1001, "CCP", new Date(), 0));
	}
	
	private static List<CompteTest> comptes2;
	{
		comptes2 = new ArrayList<CompteTest>();
		comptes2.add(new CompteTest(1002, "CCP", new Date(), 0));
		comptes2.add(new CompteTest(1003, "LA", new Date(), 2000));
	}
	
	private static List<CompteTest> comptes3;
	{
		comptes3 = new ArrayList<CompteTest>();
		comptes3.add(new CompteTest(1004, "CCP", new Date(), 0));
	}
	
	private static List<ClientTest> clients;
	{
		clients = new ArrayList<ClientTest>();
		clients.add(new ClientTest(1, "John", "Doe", "john.doe@gmail.com", "06-05-48-98-56", new Date(), comptes1));
		clients.add(new ClientTest(2, "Russ", "Smith", "russ.smith@gmail.com", "06-17-25-45-95", new Date(), comptes2));
		clients.add(new ClientTest(3, "Kate", "Williams", "kate.williams@gmail.com", "06-23-33-68-57", new Date(), comptes3));
	}
	
	//Methods
	//@Override
	public List<ClientTest> findAllClients() {
		return clients;
	}

	//@Override
	public ClientTest findClientById(int id) {
		for(ClientTest client : clients) {
			if(client.getId() == id) {
				return client;
			}
		}
		
		return null;
	}

	//@Override
	public void createClient(ClientTest client) {
		client.setId(clients.size()+1);
		clients.add(client);
	}

	//@Override
	public void deleteClient(ClientTest client) {
			clients.remove(client);
	}

	//@Override
	public void updateClient(ClientTest client) {
		deleteClient(findClientById((int) client.getId()));
		clients.add(client);
	}
}