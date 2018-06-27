package com.cama.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.dao.ClientDao;
import com.cama.model.Client;

@RestController
public class ClientController {
	
	private ClientDao clientDAO;
	
	public ClientController() {
		this.clientDAO = new ClientDao();
	}
	
	@GetMapping("/clients")
	public List<Client> getClients() {
		return clientDAO.list();
	}
	
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> getClient(@PathVariable("id") Long id) {
		Client client = clientDAO.get(id);
		
		if(client == null) {
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Client>(client, HttpStatus.OK);
	}
	
	@PostMapping("/clients")
	public ResponseEntity<Client> createClient(@RequestBody Client client) {
		clientDAO.create(client);
		
		return new ResponseEntity<Client>(client, HttpStatus.OK);
	}
	
	@DeleteMapping("/clients/{id}")
	public ResponseEntity<Long> deleteClient(@PathVariable("id") Long id) {
		
		if(clientDAO.delete(id) == null) {
			return new ResponseEntity<Long>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Long>(HttpStatus.OK);
	}
	
	@PutMapping("/clients/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable("id") Long id, @RequestBody Client client) {
		client = clientDAO.update(id, client);
		
		if(client == null) {
			return new ResponseEntity<Client>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Client>(HttpStatus.OK);
	}
}