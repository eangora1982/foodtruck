package demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="entetecommande")
public class EnteteCommande {
	private int identetecommande;
	private Utilisateur utilisateur;
	private Date datecommande;
	private int totalcommande;
	private Adresse adresse;
	private int numerofacture;


//constructeurs

//setters

//Tostring
	
}
