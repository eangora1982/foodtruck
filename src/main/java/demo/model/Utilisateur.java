package demo.model;

import java.sql.Date;

import javax.persistence.Entity;

@Entity
@Table(name="utilisateur")
public class Utilisateur {
	
	private int idutilisateur;
	private String nom;
	private String prenom;
	private Date datenaissance;
	private String statut;
	@ID
	public int getIdutilisateur() {
		return idutilisateur;
	}
	public void setIdutilisateur(int idutilisateur) {
		this.idutilisateur = idutilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSociete() {
		return societe;
	}
	public void setSociete(String societe) {
		this.societe = societe;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "Utilisateur [idutilisateur=" + idutilisateur + ", nom=" + nom + ", prenom=" + prenom
				+ ", datenaissance=" + datenaissance + ", statut=" + statut + ", email=" + email + ", genre=" + genre
				+ ", societe=" + societe + ", telephone=" + telephone + "]";
	}
	public Utilisateur(int idutilisateur, String nom, String prenom, Date datenaissance, String statut, String email,
			String genre, String societe, int telephone) {
		super();
		this.idutilisateur = idutilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.statut = statut;
		this.email = email;
		this.genre = genre;
		this.societe = societe;
		this.telephone = telephone;
	}
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String email;
	private String genre;
	private String societe;
	private int telephone;
	
}
