package demo.model;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Repas")
public class Repas {
	@Id
	@GeneratedValue
	private int id_repas;
	private boolean actif;
	private String heureLimite;

	@ManyToMany
	@JoinTable(name = "repas_famille_repas", joinColumns = @JoinColumn(name = "repas_id"), inverseJoinColumns = @JoinColumn(name = "famille_repas_id"))
	private Collection<FamilleRepas> familleRepas;

	public int getId_repas() {
		return id_repas;
	}

	public void setId_repas(int id_repas) {
		this.id_repas = id_repas;
	}

	public boolean isActif() {
		return actif;
	}

	public void setActif(boolean actif) {
		this.actif = actif;
	}

	public String getHeureLimite() {
		return heureLimite;
	}

	public void setHeureLimite(String heureLimite) {
		this.heureLimite = heureLimite;
	}

	public Collection<FamilleRepas> getFamilleRepas() {
		return familleRepas;
	}

	public void setFamilleRepas(Collection<FamilleRepas> familleRepas) {
		this.familleRepas = familleRepas;
	}

	public Repas(int id_repas, boolean actif, String heureLimite, Collection<FamilleRepas> familleRepas) {
		
		this.id_repas = id_repas;
		this.actif = actif;
		this.heureLimite = heureLimite;
		this.familleRepas = familleRepas;
	}

	public Repas() {
		
	}

	
	
	
	
}
