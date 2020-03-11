package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Adresse_Facturation;


public interface Adresse_fRepository extends JpaRepository<Adresse_Facturation, Integer> {

}
