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

import demo.model.Genre;
import demo.repository.GenreRepository;



@RestController
@RequestMapping("/genre")
public class GenreController {
	
	@Autowired
	private GenreRepository gs;
	
	@GetMapping("/listGenre")
	public ResponseEntity<List<Genre>> findAll() {
		List<Genre> list = gs.findAll();
		return new ResponseEntity<List<Genre>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/createGenre")
	public ResponseEntity<Genre> createOrUpdate(@RequestBody Genre g) {
		Genre updated = gs.save(g);
		return new ResponseEntity<Genre>(updated, new HttpHeaders(), HttpStatus.OK);	
	}

}
