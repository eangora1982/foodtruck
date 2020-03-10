package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Integer>{
	/*List<Produit> findByTitle(String title);
	List<Produit> findByPrixLessThan(int prix);
	List<Produit> findByTitreStartingWithOrderByTitre(String start);
	@Query("select a from catalogue a where a.title not like ?1%")
	List<Produit> findByMarqueNotStartingWith(String start); */
	
	
}
