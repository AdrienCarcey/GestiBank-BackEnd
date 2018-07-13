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
	
	@Override
	@GetMapping("/clientsTest")
	public ResponseEntity<List<ClientTest>> findAllClients() {
		if(clientServiceTest.findAllClients() == null) {
			return new ResponseEntity<List<ClientTest>>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<List<ClientTest>>(clientServiceTest.findAllClients(), HttpStatus.OK);
	}
	
	@Override
	@GetMapping("/clientsTest/{idClient}")
	public ResponseEntity<ClientTest> findClientById(@PathVariable("idClient") int idClient) {
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
	
	@Override
	@DeleteMapping("/clientsTest/{idClient}")
	public ResponseEntity<Boolean> deleteClientById(@PathVariable("idClient") int idClient) {
		return new ResponseEntity<Boolean>(clientServiceTest.deleteClientById(idClient), HttpStatus.OK);
	}
	
	@Override
	@PutMapping("/clientsTest/{idClient}")
	public ResponseEntity<Boolean> updateClientById(@PathVariable("idClient") int idClient, @RequestBody ClientTest client) {
		return new ResponseEntity<Boolean>(clientServiceTest.updateClientById(idClient, client), HttpStatus.OK);
	}
	
	@Override
	@PostMapping("/clientsTest/compte/{idClient}")
	public ResponseEntity<Boolean> createCompte(@PathVariable("idClient") int idClient, @RequestBody CompteTest compte) {
		return new ResponseEntity<Boolean>(clientServiceTest.createCompte(idClient, compte), HttpStatus.OK);
	}

	@Override
	@DeleteMapping("/clientsTest/compte/{idCompte}")
	public ResponseEntity<Boolean> deleteCompteByIdCompte(@PathVariable("idCompte") int idCompte) {
		return new ResponseEntity<Boolean>(clientServiceTest.deleteCompteByIdCompte(idCompte), HttpStatus.OK);
	}

	@Override
	@DeleteMapping("/clientsTest/compte/{idClient}/{idCompte}")
	public ResponseEntity<Boolean> deleteCompteByIdClient(@PathVariable("idClient") int idClient, @PathVariable("idCompte") int idCompte) {
		return new ResponseEntity<Boolean>(clientServiceTest.deleteCompteByIdClient(idClient, idCompte), HttpStatus.OK);
	}

	@Override
	@PutMapping("/clientsTest/compte/{idCompte}")
	public ResponseEntity<Boolean> updateCompteById(@PathVariable("idCompte") int idCompte, @RequestBody CompteTest compte) {
		return new ResponseEntity<Boolean>(clientServiceTest.updateCompteById(idCompte, compte), HttpStatus.OK);
	}
}