package Beans;

public class Client {
   private int id_client;
   private String nom;
   private String prenom;
   private String adresse;
public Client(int id_client, String nom, String prenom, String adresse) {
	super();
	this.id_client = id_client;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
}
public Client(String nom, String prenom, String adresse) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
}
public Client() {
	super();
}

public int getId_client() {
	return id_client;
}
public void setId_client(int id_client) {
	this.id_client = id_client;
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
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
   
}
