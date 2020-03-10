package demo.model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity(name="adresse")
public class Adresse {
	
	private int idadresse;
	private Utilisateur utilisateur;
	private int numerorue;
	private int cp;
	private Boolean isActif;
	private String ville;
	private String pays;
	private String adresselivraison;
	public String getAdressefacturation() {
		return adressefacturation;
	}
	public void setAdressefacturation(String adressefacturation) {
		this.adressefacturation = adressefacturation;
	}
	public Adresse(int id, Utilisateur utilisateur, int numerorue, int cp, Boolean isActif, String ville, String pays,
			String adresselivraison, String adressefacturation) {
		super();
		this.id = id;
		this.utilisateur = utilisateur;
		this.numerorue = numerorue;
		this.cp = cp;
		this.isActif = isActif;
		this.ville = ville;
		this.pays = pays;
		this.adresselivraison = adresselivraison;
		this.adressefacturation = adressefacturation;
	}
	public String getAdresselivraison() {
		return adresselivraison;
	}
	public void setAdresselivraison(String adresselivraison) {
		this.adresselivraison = adresselivraison;
	}
	private String adressefacturation;
	public Adresse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adresse(int id, Utilisateur utilisateur, int numerorue, int cp, Boolean isActif, String ville, String pays,
			String typeadresse) {
		super();
		this.idadresse = idadresse;
		this.utilisateur = utilisateur;
		this.numerorue = numerorue;
		this.cp = cp;
		this.isActif = isActif;
		this.ville = ville;
		this.pays = pays;
	}
	@Id
	public int getIdadresse() {
		return idadresse;
	}
	public void setIdadresse(int idadresse) {
		this.idadresse = idadresse;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public int getNumerorue() {
		return numerorue;
	}
	public void setNumerorue(int numerorue) {
		this.numerorue = numerorue;
	}
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public Boolean getIsActif() {
		return isActif;
	}
	public void setIsActif(Boolean isActif) {
		this.isActif = isActif;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	@Override
	public String toString() {
		return "Adresse [idadresse=" + idadresse + ", utilisateur=" + utilisateur + ", numerorue=" + numerorue + ", cp=" + cp
				+ ", isActif=" + isActif + ", ville=" + ville + ", pays=" + pays + ", adresselivraison="
				+ adresselivraison + ", adressefacturation=" + adressefacturation + "]";
	}
	
}
