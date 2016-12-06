package Beans;

public class Compte {
 int id_compte;
 String libelle_compte;
 String date_de_creation;
 double solde;
 Client client;
public Compte(int id_compte, String libelle_compte, String date_de_creation,
		double solde, Client client) {
	super();
	this.id_compte = id_compte;
	this.libelle_compte = libelle_compte;
	this.date_de_creation = date_de_creation;
	this.solde = solde;
	this.client = client;
}
public Compte(String libelle_compte, String date_de_creation, double solde,
		Client client) {
	super();
	this.libelle_compte = libelle_compte;
	this.date_de_creation = date_de_creation;
	this.solde = solde;
	this.client = client;
}
public Compte() {
	super();
}
public int getId_compte() {
	return id_compte;
}
public void setId_compte(int id_compte) {
	this.id_compte = id_compte;
}
public String getLibelle_compte() {
	return libelle_compte;
}
public void setLibelle_compte(String libelle_compte) {
	this.libelle_compte = libelle_compte;
}
public String getDate_de_creation() {
	return date_de_creation;
}
public void setDate_de_creation(String date_de_creation) {
	this.date_de_creation = date_de_creation;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
 

 
}
