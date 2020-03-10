package demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name="catalogue")
public class Actualite {
	
	private int idprod;
	private String Title;
	private String description;
	private String imageUrl;
	private String dateCreation;
	private String datevalidite;
	private int utilisateurCreation;
	public Actualite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actualite(int idprod, String title, String description, String imageUrl, String dateCreation,
			String datevalidite, int utilisateurCreation) {
		super();
		this.idprod = idprod;
		Title = title;
		this.description = description;
		this.imageUrl = imageUrl;
		this.dateCreation = dateCreation;
		this.datevalidite = datevalidite;
		this.utilisateurCreation = utilisateurCreation;
	}
	@Id
	public int getIdprod() {
		return idprod;
	}
	public void setIdprod(int idprod) {
		this.idprod = idprod;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDatevalidite() {
		return datevalidite;
	}
	public void setDatevalidite(String datevalidite) {
		this.datevalidite = datevalidite;
	}
	public int getUtilisateurCreation() {
		return utilisateurCreation;
	}
	public void setUtilisateurCreation(int utilisateurCreation) {
		this.utilisateurCreation = utilisateurCreation;
	}
	@Override
	public String toString() {
		return "Produit [idprod=" + idprod + ", Title=" + Title + ", description=" + description + ", imageUrl="
				+ imageUrl + ", dateCreation=" + dateCreation + ", datevalidite=" + datevalidite
				+ ", utilisateurCreation=" + utilisateurCreation + "]";
	}
	

}
