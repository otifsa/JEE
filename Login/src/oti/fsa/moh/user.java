package oti.fsa.moh;

public class user {
private String nom;
private int age;
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public user(String nom, int age) {
	super();
	this.nom = nom;
	this.age = age;
}
public user() {
	super();
}
@Override
public String toString() {
	return "user [nom=" + nom + ", age=" + age + "]";
}

public void show(){
	System.out.println(toString());
}
}
