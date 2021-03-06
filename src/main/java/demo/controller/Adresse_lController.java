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

import demo.model.Adresse_Livraison;
import demo.repository.Adresse_lRepository;


@RestController
@RequestMapping("/adresseLivraison")
public class Adresse_lController {

	@Autowired
	private Adresse_lRepository ar;
	
	@GetMapping("/listeAdresseLivraison")
	public ResponseEntity<List<Adresse_Livraison>> findAll() {
		List<Adresse_Livraison> list = ar.findAll();
		return new ResponseEntity<List<Adresse_Livraison>>(list, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/createAdresseLivraison")
	public ResponseEntity<Adresse_Livraison> createOrUpdate(@RequestBody Adresse_Livraison a) {
		Adresse_Livraison updated = ar.save(a);
		return new ResponseEntity<Adresse_Livraison>(updated, new HttpHeaders(), HttpStatus.OK);	
	}

}
