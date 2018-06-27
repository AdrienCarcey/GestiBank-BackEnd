package com.cama.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cama.model.Client;
import com.cama.model.Compte;

public class ClientDao {
	
	//Attributes
	private static List<Compte> comptes1;
	{
		comptes1 = new ArrayList<Compte>();
		comptes1.add(new Compte(1001, "CCP", new Date(), 0));
	}
	
	private static List<Compte> comptes2;
	{
		comptes2 = new ArrayList<Compte>();
		comptes2.add(new Compte(1002, "CCP", new Date(), 0));
		comptes2.add(new Compte(1003, "LA", new Date(), 2000));
	}
	
	private static List<Compte> comptes3;
	{
		comptes3 = new ArrayList<Compte>();
		comptes3.add(new Compte(1004, "CCP", new Date(), 0));
	}
	
	private static List<Client> clients;
	{
		clients = new ArrayList<Client>();
		clients.add(new Client(10L, "John", "Doe", "john.doe@gmail.com", "06-05-48-98-56", comptes1));
		clients.add(new Client(20L, "Russ", "Smith", "russ.smith@gmail.com", "06-17-25-45-95", comptes2));
		clients.add(new Client(30L, "Kate", "Williams", "kate.williams@gmail.com", "06-23-33-68-57", comptes3));
	}
	
	//Constructor
	public ClientDao() {
		super();
	}
	
	//Methods
	public List<Client> list() {
		return clients;
	}
	
	public Client get(Long id) {
		for(Client c : clients) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		
		return null;
	}
	
	public Client create(Client client) {
		client.setId(System.currentTimeMillis());
		clients.add(client);
		return client;
	}
	
	public Long delete(Long id) {
		for(Client c : clients) {
			if(c.getId().equals(id)) {
				clients.remove(c);
				return id;
			}
		}
		
		return null;
	}
	
	public Client update(Long id, Client client) {
		for(Client c : clients) {
			if(c.getId().equals(id)) {
				clients.remove(c);
				clients.add(client);
				return client;
			}
		}
		
		return null;
	}
}