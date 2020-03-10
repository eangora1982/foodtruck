package demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.Produit;
import demo.repository.ProduitRepository;

public class ProduitController {
	@RestController
	@RequestMapping("/produit")
	public class ActualiteController {
		
		@Autowired
		private ProduitRepository produitrepository;  

		@GetMapping("getAll")
		public List<Produit> All(){
//			Produit p = new Produit(1,"banane","bon produit","mon.jpg","20/10/12","25/01/12",1);
//			List<Produit> l = new ArrayList<Produit>();
//			l.add(p);
//			return l;
			return produitrepository.findAll(); 
		}
		@GetMapping("getbyid")
		public Optional<Produit> FindById(){
//			Produit p = new Produit(1,"banane","bon produit","mon.jpg","20/10/12","25/01/12",1);
//			List<Produit> l = new ArrayList<Produit>();
//			l.add(p);
//			return l;
			return produitrepository.findById(1); 
		}
	}	
}
