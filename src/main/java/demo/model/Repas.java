package demo.model;


import javax.persistence.Entity;

@Entity
@Table(name="repas")
public class Repas {
	
	private int idrepas;
	private String libelle;
	private Boolean actif;
	private String heurelimitecommande;


	@Id
	public int getIDrepas() {
		return idrepas;
	}
	public void setIdrepas(int idrepas) {
		this.idrepas = idrepas;
	}
	
}
