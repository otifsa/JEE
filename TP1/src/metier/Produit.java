package metier;
public class Produit {
private Long id; // utiliser l'objet Long et non pqs les le primitive long pour
// l'utiliser dans le mapping avec le framework hibernate par exemple
private String nom, desc;
private int prix,etat;

public Produit() {
super();
// TODO Auto-generated constructor stub
}
public Produit(Long id, String nom, String desc, int prix, int etat) {
super();
this.id = id;
this.nom = nom;
this.desc = desc;
this.prix = prix;
this.etat = etat;}
public Produit(String nom, String desc, int prix, int etat) {
super();
this.nom = nom;
this.desc = desc;
this.prix = prix;
this.etat = etat;
}
public Long getId() {return id;}
public void setId(Long id) {this.id = id;}
public String getNom() {return nom;}
public void setNom(String nom) {this.nom = nom;}
public String getDesc() {return desc;}
public void setDesc(String desc) {this.desc = desc;}
public int getPrix() {return prix;}
public void setPrix(int prix) {this.prix = prix;}
public int getEtat() {return etat;}
public void setEtat(int etat) {this.etat = etat;}
@Override
public String toString() {
return "Produit [id=" + id + ", nom=" + nom + ", desc=" + desc + ", prix="
+ prix + ", etat=" + etat + "]";}
public void show(){System.out.println(toString());}
}