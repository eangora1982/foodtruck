package demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import demo.model.User;
import demo.repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository up;

	public User createOrUpdate(User entity) {
		if (entity.getId() != 0) {
			Optional<User> u = up.findById(entity.getId());
			if (u.isPresent()) {
				User newU = new User();
				newU.setId(entity.getId());
				newU.setNom(entity.getNom());
				newU.setPrenom(entity.getPrenom());
				newU.setDate_de_naissance(entity.getDate_de_naissance());
				newU.setEmail(entity.getEmail());
				newU.setGenre(entity.getGenre());
				newU.setAf(entity.getAf());
				newU.setAl(entity.getAl());
				newU = up.save(newU);
				return newU;
			} else {
				entity = up.save(entity);
				return entity;
			}
		} else {
			entity = up.save(entity);
			return entity;
		}
	}

	public List<User> findAll() {
		List<User> liste = up.findAll();
		if (liste.size() > 0)
			return liste;
		else
			System.out.println("Il y a pas de personne");
		return new ArrayList<User>();
	}

}
