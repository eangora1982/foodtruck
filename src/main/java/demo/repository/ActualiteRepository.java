package demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Actualite;

public interface ActualiteRepository extends JpaRepository<Actualite,Integer>{
	/*List<Produit> findByTitle(String title);
	List<Produit> findByPrixLessThan(int prix);
	List<Produit> findByTitreStartingWithOrderByTitre(String start);
	@Query("select a from catalogue a where a.title not like ?1%")
	List<Produit> findByMarqueNotStartingWith(String start); */
	
	
}
