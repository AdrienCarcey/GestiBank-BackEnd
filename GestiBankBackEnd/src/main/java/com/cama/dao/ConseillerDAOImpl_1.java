package com.cama.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cama.model.Adresse;
import com.cama.model.Conseiller;
import com.cama.model.Contact;
import com.cama.model.Identite;

@Repository("conseillerDAO")
public class ConseillerDAOImpl_1 implements ConseillerDAO {
	
	//Fake DataBase
	private static List<Conseiller> conseillers;
	{
		conseillers = new ArrayList<Conseiller>();
		conseillers.add(new Conseiller(1, "Adri", "Chat17", new Identite("Monsieur", "Carcey", "Adrien", new Date()) ,new Contact("adrien.carcey@hotmail.fr", "06-11-22-33-44", new Adresse(5, "rue Amelie Gex", null, 73400, "Ugine", "France"))));
		conseillers.add(new Conseiller(2, "Sylvou", "Lapin19", new Identite("Monsieur", "Morisse", "Sylvain", new Date()) ,new Contact("sylvain.morisse@hotmail.fr", "06-55-66-77-88", new Adresse(10, "rue Victor Hugo", null, 73400, "Ugine", "France"))));
		
	}
	
	//Constructor
	public ConseillerDAOImpl_1() {
		super();
	}
	
	//Methods
	@Override
	public List<Conseiller> findAllConseiller() {
		return conseillers;
	}

	@Override
	public Conseiller findConseillerById(int id) {
		for(Conseiller c : conseillers) {
			if(c.getIdUtilisateur() == id) {
				return c;
			}
		}
		
		return null;
	}

	@Override
	public Conseiller createConseiller(Conseiller conseiller) {
		conseiller.setIdUtilisateur(conseillers.size());
		conseillers.add(conseiller);
		return conseiller;
		
	}

	@Override
	public Integer deleteConseillerById(int id) {
		for(Conseiller c : conseillers) {
			if(c.getIdUtilisateur()== id) {
				conseillers.remove(c);
				return id;
			}
		}
		
		return null;
	}

	@Override
	public Conseiller updateConseillerById(int id, Conseiller conseiller) {
		for(Conseiller c : conseillers) {
			if(c.getIdUtilisateur() == id) {
				conseillers.remove(c);
				conseillers.add(conseiller);
				return conseiller;
			}
		}
		
		return null;
	}
}