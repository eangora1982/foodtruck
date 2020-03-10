package demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit {
	private int idProduit;
	private String libelleProduit;
	private String libelleCommercial;
	private int prix;
	private String description;
	private Boolean dispo;
	private String imageUrl;
	private String familleRepas;
	private String stock;
	private String composition;
	private int nbreVendu;
	
	
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public String getLibelleProduit() {
		return libelleProduit;
	}
	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}
	public String getLibelleCommercial() {
		return libelleCommercial;
	}
	public void setLibelleCommercial(String libelleCommercial) {
		this.libelleCommercial = libelleCommercial;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getDispo() {
		return dispo;
	}
	public void setDispo(Boolean dispo) {
		this.dispo = dispo;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getFamilleRepas() {
		return familleRepas;
	}
	public void setFamilleRepas(String familleRepas) {
		this.familleRepas = familleRepas;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public String getComposition() {
		return composition;
	}
	public void setComposition(String composition) {
		this.composition = composition;
	}
	public int getNbreVendu() {
		return nbreVendu;
	}
	public void setNbreVendu(int nbreVendu) {
		this.nbreVendu = nbreVendu;
	}
	public Produit(int idProduit, String libelleProduit, String libelleCommercial, int prix, String description,
			Boolean dispo, String imageUrl, String familleRepas, String stock, String composition, int nbreVendu) {
		super();
		this.idProduit = idProduit;
		this.libelleProduit = libelleProduit;
		this.libelleCommercial = libelleCommercial;
		this.prix = prix;
		this.description = description;
		this.dispo = dispo;
		this.imageUrl = imageUrl;
		this.familleRepas = familleRepas;
		this.stock = stock;
		this.composition = composition;
		this.nbreVendu = nbreVendu;
	}
	public Produit() {
		super();

	}
	

}
