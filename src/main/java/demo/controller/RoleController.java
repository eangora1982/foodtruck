package demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Role;
import demo.repository.RoleRepository;



@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleRepository rs;
	
	@GetMapping("/listRole")
	public ResponseEntity<List<Role>> findAll() {
		List<Role> list = rs.findAll();
		return new ResponseEntity<List<Role>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/createRole")
	public ResponseEntity<Role> createOrUpdate(@RequestBody Role r) {
		Role updated = rs.save(r);
		return new ResponseEntity<Role>(updated, new HttpHeaders(), HttpStatus.OK);	
	}

}
