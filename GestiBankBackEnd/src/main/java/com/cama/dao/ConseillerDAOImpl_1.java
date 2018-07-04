package com.cama.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cama.model.Conseiller;

@Repository("conseillerDAO")
public class ConseillerDAOImpl_1 implements ConseillerDAO {
	
	//Fake DataBase
	private static List<Conseiller> conseillers;
	{
		conseillers = new ArrayList<Conseiller>();
		conseillers.add(new Conseiller());
		conseillers.add(new Conseiller());
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