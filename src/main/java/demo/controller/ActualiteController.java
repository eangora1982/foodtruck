package demo.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Actualite;
import demo.repository.ActualiteRepository;

@RestController
@RequestMapping("/actualite")
public class ActualiteController {
	
	@Autowired
	private ActualiteRepository produitrepository;  

	@GetMapping("getAll")
	public List<Actualite> All(){
//		Produit p = new Produit(1,"banane","bon produit","mon.jpg","20/10/12","25/01/12",1);
//		List<Produit> l = new ArrayList<Produit>();
//		l.add(p);
//		return l;
		return produitrepository.findAll(); 
	}
	@GetMapping("getbyid")
	public Optional<Actualite> FindById(){
//		Produit p = new Produit(1,"banane","bon produit","mon.jpg","20/10/12","25/01/12",1);
//		List<Produit> l = new ArrayList<Produit>();
//		l.add(p);
//		return l;
		return produitrepository.findById(1); 
	}
	
	
	@GetMapping("creer")
	@Transactional
	public void create(Actualite a) {
		
		
	}
	

}
