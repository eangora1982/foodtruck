package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.model.Produit;


@Repository
public interface ProductRepository extends JpaRepository<Produit, Integer> {
	
	

}
