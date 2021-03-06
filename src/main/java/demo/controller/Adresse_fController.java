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

import demo.model.Adresse_Facturation;
import demo.repository.Adresse_fRepository;

@RestController
@RequestMapping("/adresseFacture")
public class Adresse_fController {
	
	@Autowired
	private Adresse_fRepository ar;
	
	@GetMapping("/listeAdresseFacture")
	public List<Adresse_Facturation> findAll() {
		List<Adresse_Facturation> list = ar.findAll();
		System.out.println("ghjkl");
		return list; 
	}
	
	@PostMapping("/createAdresseFacturation")
	public ResponseEntity<Adresse_Facturation> createOrUpdate(@RequestBody Adresse_Facturation a) {
		Adresse_Facturation updated = ar.save(a);
		return new ResponseEntity<Adresse_Facturation>(updated, new HttpHeaders(), HttpStatus.OK);	
	}

}
