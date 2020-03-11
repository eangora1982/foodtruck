package demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.model.FamilleRepas;
import demo.model.Produit;
import demo.repository.FamilleRepasRepository;
import demo.repository.ProductRepository;



@RestController
@RequestMapping("/catalogue")
public class ProduitController {

	@Autowired
	private ProductRepository productRepo;
	private FamilleRepasRepository frepasRepo;

	@GetMapping("/listeCatalogue")
	public List<Produit> listeCatalogue() {
		List<FamilleRepas> frl = new ArrayList<FamilleRepas>();
		FamilleRepas fr1 = new FamilleRepas();
		fr1.setId_famille_repas(1);
		fr1.setActif(true);
		frl.add(fr1);

		List<Produit> maliste = new ArrayList<Produit>();
		Produit a = new Produit();

		a.setId_produit(1);
		a.setImageUrl(
		"https://img2.freepng.fr/20180620/jxa/kisspng-vittel-mineral-water-drinking-water-perrier-acqua-panna-5b2a5e56f3ed17.0223030615295033189991.jpg");
		a.setLibelle_produit_commerciale("Vittel eau de source");
		a.setLibelle_produit_technique("Eau de source de Montagne venu du fin fond de l'Himalaya");
		a.setPrix(32.2);
		a.setStock(25);
		a.setQuantite(2);
		a.setNbrVente(25);
		a.setDescription("Eau de source pur comme de l'eau");
		a.setComposition("Un atome d’oxygène relié à deux atomes d’hydrogène");
		a.setDispo("1");
		a.setFamilleRepas(fr1);
		maliste.add(a);

		return maliste;
	}

	@PostMapping("/create")
	public void create(@RequestBody Produit a, @RequestBody FamilleRepas fr1) {
		frepasRepo.save(fr1);
		productRepo.save(a);

	}
	
	 @GetMapping("/getAll")
	    public List<Produit> getAllProduit() {
	        return productRepo.findAll();
	    }

}
