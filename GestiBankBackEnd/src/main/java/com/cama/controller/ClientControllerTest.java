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

import com.cama.dao.ClientDaoTest;
import com.cama.model.ClientTest;

@RestController
public class ClientControllerTest {
	
	private ClientDaoTest clientDAO;
	
	public ClientControllerTest() {
		this.clientDAO = new ClientDaoTest();
	}
	
	@GetMapping("/clientsTest")
	public List<ClientTest> getClients() {
		return clientDAO.list();
	}
	
	@GetMapping("/clientsTest/{id}")
	public ResponseEntity<ClientTest> getClient(@PathVariable("id") int id) {
		ClientTest client = clientDAO.get(id);
		
		if(client == null) {
			return new ResponseEntity<ClientTest>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<ClientTest>(client, HttpStatus.OK);
	}
	
	@PostMapping("/clientsTest")
	public ResponseEntity<ClientTest> createClient(@RequestBody ClientTest client) {
		clientDAO.create(client);
		
		return new ResponseEntity<ClientTest>(client, HttpStatus.OK);
	}
	
	@DeleteMapping("/clientsTest/{id}")
	public ResponseEntity<Integer> deleteClient(@PathVariable("id") int id) {
		
		if(clientDAO.delete(id) == null) {
			return new ResponseEntity<Integer>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<Integer>(id, HttpStatus.OK);
	}
	
	@PutMapping("/clientsTest/{id}")
	public ResponseEntity<ClientTest> updateClient(@PathVariable("id") int id, @RequestBody ClientTest client) {
		client = clientDAO.update(id, client);
		
		if(client == null) {
			return new ResponseEntity<ClientTest>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<ClientTest>(client, HttpStatus.OK);
	}
}