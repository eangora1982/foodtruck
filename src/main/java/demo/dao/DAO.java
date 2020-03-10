package demo.dao;

import java.util.List;

import demo.model.Actualite;

public interface DAO <T,PK>{

	public List<T> find();
	public T findById(PK id);
	public void create(T a);
	public void update(T a);
	public void delete(T a);
	List<Actualite> findByName(String titre);
}
