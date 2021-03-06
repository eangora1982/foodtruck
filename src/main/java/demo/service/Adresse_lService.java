package demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import demo.model.Adresse_Livraison;
import demo.repository.Adresse_lRepository;

public class Adresse_lService {
	
	@Autowired 
	private Adresse_lRepository ar;
	
	public Adresse_Livraison createOrUpdate(Adresse_Livraison entity) {
		if (entity.getId() != 0) {
			Optional<Adresse_Livraison> a = ar.findById(entity.getId());
			if (a.isPresent()) {
				Adresse_Livraison newA = new Adresse_Livraison();
				newA.setId(entity.getId());
				newA.setRue(entity.getRue());
				newA.setCp(entity.getCp());
				newA.setVille(entity.getVille());
				newA.setUser(entity.getUser());
				return newA;
			} else {
				entity = ar.save(entity);
				return entity;
			}
		} else {
			entity = ar.save(entity);
			return entity;
		}
	}
	
	public List<Adresse_Livraison> findAll() {
		List<Adresse_Livraison> liste = ar.findAll();
		if (liste.size() > 0)
			return liste;
		else {
			System.out.println("Il n'y a pas de genre");
			return new ArrayList<Adresse_Livraison>();
		}
	}

}
