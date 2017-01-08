import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.opensymphony.xwork2.ActionSupport;

import oti.fsa.ac.ma.beans.PersonneRemote;
import oti.fsa.ac.ma.entites.Personne;

public class PersonneAction extends ActionSupport {
	private String nom;
	private String prenom;
	private static Context initialContext;
	public String execute() throws NamingException{
		System.out.println(nom);
		System.out.println(prenom);
		Context ctx = getInitialContext();
		PersonneRemote bean=(PersonneRemote) ctx.lookup("PersonneBeans/remote");
		Personne P=new Personne();
		P.setNom(nom);
		P.setPrenom(prenom);
		bean.addPersonne(P);
		return "OK";
	}
	public static Context getInitialContext() throws NamingException {
		String PROVIDER_URL = "jnp://localhost:1099";
		String JNP_INTERFACES = "org.jboss.naming:org.jnp.interfaces";
		String INITIAL_CONTEXT_FACTORY = "org.jnp.interfaces.NamingContextFactory";
		
        if (initialContext == null) {
            // Properties extends HashTable
            Properties prop = new Properties();
            prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
            prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
            prop.put(Context.PROVIDER_URL, PROVIDER_URL);
            initialContext = new InitialContext(prop);
        }
        return initialContext;
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
	

}
