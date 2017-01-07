import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import oti.fsa.ac.ma.beans.PersonneRemote;
import oti.fsa.ac.ma.entites.Personne;

public class Client {
	private static Context initialContext;
public static void main(String[] args) throws NamingException {
	Context ctx = getInitialContext();
	PersonneRemote bean=(PersonneRemote) ctx.lookup("PersonneBeans/remote");
	Personne P=new Personne();
	P.setNom("ali");
	P.setPrenom("ali");
	bean.addPersonne(P);
	
}	
	


public static Context getInitialContext() throws NamingException
{
	String PROVIDER_URL = "jnp://localhost:1099";
	String JNP_INTERFACES = "org.jboss.naming:org.jnp.interfaces";
	String INITIAL_CONTEXT_FACTORY = "org.jnp.interfaces.NamingContextFactory";
	
    if (initialContext == null) {
        //Properties extends HashTable
        Properties prop = new Properties();                   
        prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
        prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
        prop.put(Context.PROVIDER_URL, PROVIDER_URL);
        initialContext = new InitialContext(prop);
    }
    return initialContext;
}
	
}
