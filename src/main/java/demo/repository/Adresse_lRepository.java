package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Adresse_Livraison;


public interface Adresse_lRepository extends JpaRepository<Adresse_Livraison, Integer> {

}
