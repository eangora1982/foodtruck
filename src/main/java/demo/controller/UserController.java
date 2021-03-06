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

import demo.model.User;
import demo.repository.UserRepository;



@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository us;

	@GetMapping("/listUser")
	public ResponseEntity<List<User>> findAll() {
		List<User> liste = us.findAll();
		return new ResponseEntity<List<User>>(liste, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/createUser")
	public ResponseEntity<User> createOrUpdate(@RequestBody User u) {
		User updated = us.save(u);
		return new ResponseEntity<User>(updated, new HttpHeaders(), HttpStatus.OK);
	}

}
