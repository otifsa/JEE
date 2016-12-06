package Beans;

public class Operation {
int id_operation;
String libelle;
double montant;
String date_operation;
String type_operation;
Compte compte;
public int getId_operation() {
	return id_operation;
}
public void setId_operation(int id_operation) {
	this.id_operation = id_operation;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public String getDate_operation() {
	return date_operation;
}
public void setDate_operation(String date_operation) {
	this.date_operation = date_operation;
}
public String getType_operation() {
	return type_operation;
}
public void setType_operation(String type_operation) {
	this.type_operation = type_operation;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
public Operation(int id_operation, String libelle, double montant,
		String date_operation, String type_operation, Compte compte) {
	super();
	this.id_operation = id_operation;
	this.libelle = libelle;
	this.montant = montant;
	this.date_operation = date_operation;
	this.type_operation = type_operation;
	this.compte = compte;
}
public Operation(String libelle, double montant, String date_operation,
		String type_operation, Compte compte) {
	super();
	this.libelle = libelle;
	this.montant = montant;
	this.date_operation = date_operation;
	this.type_operation = type_operation;
	this.compte = compte;
}
public Operation() {
	super();
}



}
