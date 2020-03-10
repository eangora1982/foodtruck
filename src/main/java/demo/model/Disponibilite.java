package demo.model;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="disponibilite")
public class Disponibilite {
	private Produit produit;
	private String jourdispo;
	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Disponibilite(Produit produit, String jourdispo) {
		super();
		this.produit = produit;
		this.jourdispo = jourdispo;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public String getJourdispo() {
		return jourdispo;
	}
	public void setJourdispo(String jourdispo) {
		this.jourdispo = jourdispo;
	}
	@Override
	public String toString() {
		return "Disponibilite [produit=" + produit + ", jourdispo=" + jourdispo + "]";
	}

}
