package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.model.Repas;



@Repository
public interface RepasRepository extends JpaRepository<Repas, Integer> {

}
