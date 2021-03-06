package demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import demo.model.Genre;
import demo.repository.GenreRepository;


public class GenreService {
	
	@Autowired 
	private GenreRepository gp;
	
	public Genre createOrUpdate(Genre entity) {
		if (entity.getId() != 0) {
			Optional<Genre> g = gp.findById(entity.getId());
			if (g.isPresent()) {
				Genre newG = new Genre();
				newG.setId(entity.getId());
				newG.setLibelle(entity.getLibelle());
				return newG;
			} else {
				entity = gp.save(entity);
				return entity;
			}
		} else {
			entity = gp.save(entity);
			return entity;
		}
	}
	
	public List<Genre> findAll() {
		List<Genre> liste = gp.findAll();
		if (liste.size() > 0)
			return liste;
		else {
			System.out.println("Il n'y a pas de genre");
			return new ArrayList<Genre>();
		}
	}

}
