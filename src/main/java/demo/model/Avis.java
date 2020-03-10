package demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="avis")
public class Avis {
	
	private int idavis;
	private Produit produit;
	private Utilisateur utlisateur;
	private String commentaire;
	private String note;
	@Override
	public String toString() {
		return "Avis [idavis=" + idavis + ", produit=" + produit + ", utlisateur=" + utlisateur + ", commentaire="
				+ commentaire + ", note=" + note + "]";
	}
	@Id
	public int getIdavis() {
		return idavis;
	}
	public void setIdavis(int idavis) {
		this.idavis = idavis;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Utilisateur getUtlisateur() {
		return utlisateur;
	}
	public void setUtlisateur(Utilisateur utlisateur) {
		this.utlisateur = utlisateur;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Avis(int idavis, Produit produit, Utilisateur utlisateur, String commentaire, String note) {
		super();
		this.idavis = idavis;
		this.produit = produit;
		this.utlisateur = utlisateur;
		this.commentaire = commentaire;
		this.note = note;
	}
	public Avis() {
		super();
		// TODO Auto-generated constructor stub
	}

}
