package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Genre;


public interface GenreRepository extends JpaRepository<Genre, Integer>{

}
