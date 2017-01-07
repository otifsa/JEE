package oti.fsa.ac.ma.entites;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity

public class Personne implements Serializable {

	   
	@Id
	@GeneratedValue
	private int id;
	private String nom;
	private String prenom;
	private static final long serialVersionUID = 1L;

	public Personne() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
   
}
