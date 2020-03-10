package demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="lignecommande")
public class LigneCommande {
	private int idlignecommande;
	private Produit produit;
	private int quantite;
	private int prixunitaire;
	private EnteteCommande entetecommande;

//Constructeurs

//Setters

//To string


	

}
