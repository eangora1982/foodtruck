package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {

	@GeneratedValue
	@Id
	private int id;
	private String libelle;
	
	public Role(int id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	public Role() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", libelle=" + libelle + "]";
	}
	
}
