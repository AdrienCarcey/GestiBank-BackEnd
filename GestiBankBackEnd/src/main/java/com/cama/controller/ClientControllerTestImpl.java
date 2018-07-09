package com.cama.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cama.model.ClientTest;
import com.cama.service.ClientServiceTest;

@RestController
public class ClientControllerTestImpl implements ClientControllerTest {
	
	@Autowired
	private ClientServiceTest clientServiceTest;
	
	@GetMapping("/clientsTest")
	public ResponseEntity<List<ClientTest>> findAllClients() {
		if(clientServiceTest.findAllClients() == null) {
			return new ResponseEntity<List<ClientTest>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<ClientTest>>(clientServiceTest.findAllClients(), HttpStatus.OK);
	}
	
	@GetMapping("/clientsTest/{id}")
	public ResponseEntity<ClientTest> findClientById(@PathVariable("id") int id) {
		if(clientServiceTest.findClientById(id) == null) {
			return new ResponseEntity<ClientTest>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<ClientTest>(clientServiceTest.findClientById(id), HttpStatus.OK);
	}
	
	@PostMapping("/clientsTest")
	public ResponseEntity<Boolean> createClient(@RequestBody ClientTest client) {
		clientServiceTest.createClient(client);
		
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@DeleteMapping("/clientsTest/{id}")
	public ResponseEntity<Boolean> deleteClientById(@PathVariable("id") int id) {
		if(clientServiceTest.findClientById(id) == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
		}
		
		clientServiceTest.deleteClient(clientServiceTest.findClientById(id));
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
	
	@PutMapping("/clientsTest/{id}")
	public ResponseEntity<Boolean> updateClientById(@PathVariable("id") int id, @RequestBody ClientTest client) {
		if(clientServiceTest.findClientById(id) == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.NOT_FOUND);
		}
		
		clientServiceTest.updateClient(client);
		return new ResponseEntity<Boolean>(true, HttpStatus.OK);
	}
}