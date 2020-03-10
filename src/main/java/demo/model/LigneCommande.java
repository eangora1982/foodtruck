package demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class LigneCommande {
	private int entetecommande;
	private Utilisateur utilisateur;
	private Date datecommande;
	private int totalcommande;
	private int numerofacture;
	

}
