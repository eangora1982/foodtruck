
package demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.model.Role;
import demo.repository.RoleRepository;


@Service
public class RoleService {
	
	@Autowired 
	private RoleRepository rp;
	
	public Role createOrUpdate(Role entity) {
		if (entity.getId() != 0) {
			Optional<Role> r = rp.findById(entity.getId());
			if (r.isPresent()) {
				Role newR = new Role();
				newR.setId(entity.getId());
				newR.setLibelle(entity.getLibelle());
				return newR;
			} else {
				entity = rp.save(entity);
				return entity;
			}
		} else {
			entity = rp.save(entity);
			return entity;
		}
	}
	
	public List<Role> findAll() {
		List<Role> liste = rp.findAll();
		if (liste.size() > 0)
			return liste;
		else {
			System.out.println("");
			return new ArrayList<Role>();
		}
	}

}
