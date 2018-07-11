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
import com.cama.model.CompteTest;
import com.cama.service.ClientServiceTest;

@RestController
public class ClientControllerTestImpl implements ClientControllerTest {
	
	@Autowired
	private ClientServiceTest clientServiceTest;
	
	@GetMapping("/clientsTest")
	@Override
	public ResponseEntity<List<ClientTest>> findAllClients() {
		if(clientServiceTest.findAllClients() == null) {
			return new ResponseEntity<List<ClientTest>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<ClientTest>>(clientServiceTest.findAllClients(), HttpStatus.OK);
	}
	
	@GetMapping("/clientsTest/{id}")
	@Override
	public ResponseEntity<ClientTest> findClientById(@PathVariable("id") int idClient) {
		if(clientServiceTest.findClientById(idClient) == null) {
			return new ResponseEntity<ClientTest>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<ClientTest>(clientServiceTest.findClientById(idClient), HttpStatus.OK);
	}
	
	@Override
	@PostMapping("/clientsTest")
	public ResponseEntity<Boolean> createClient(@RequestBody ClientTest client) {
		return new ResponseEntity<Boolean>(clientServiceTest.createClient(client), HttpStatus.OK);
	}
	
	@DeleteMapping("/clientsTest/{id}")
	@Override
	public ResponseEntity<Boolean> deleteClientById(@PathVariable("id") int idClient) {
		return new ResponseEntity<Boolean>(clientServiceTest.deleteClientById(idClient), HttpStatus.OK);
	}
	
	@PutMapping("/clientsTest/{id}")
	@Override
	public ResponseEntity<Boolean> updateClientById(@PathVariable("id") int idClient, @RequestBody ClientTest client) {
		return new ResponseEntity<Boolean>(clientServiceTest.updateClientById(idClient, client), HttpStatus.OK);
	}

	@PostMapping("/clientsTest/compte/{id}")
	@Override
	public ResponseEntity<Boolean> createCompte(@PathVariable("id") int idClient, @RequestBody CompteTest compte) {
		return new ResponseEntity<Boolean>(clientServiceTest.createCompte(idClient, compte), HttpStatus.OK);
	}

	@DeleteMapping("/clientsTest/compte/{id}")
	@Override
	public ResponseEntity<Boolean> deleteCompteById(@PathVariable("id") int idCompte) {
		return new ResponseEntity<Boolean>(clientServiceTest.deleteCompteById(idCompte), HttpStatus.OK);
	}
}