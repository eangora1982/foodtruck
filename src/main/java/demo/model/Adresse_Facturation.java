package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="adresse_f")
public class Adresse_Facturation {
	@GeneratedValue
	@Id
	private int id;
	private String rue;
	private int cp;
	private String ville;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public Adresse_Facturation(int id, String rue, int cp, String ville, User user) {
		
		this.id = id;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
		this.user = user;
	}
	
	public Adresse_Facturation() {
		
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Adresse_Facturation [id=" + id + ", rue=" + rue + ", cp=" + cp + ", ville=" + ville + ", user=" + user
				+ "]";
	}
	
	
	
}
