package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.model.FamilleRepas;



@Repository
public interface FamilleRepasRepository extends JpaRepository<FamilleRepas, Integer> {

}
