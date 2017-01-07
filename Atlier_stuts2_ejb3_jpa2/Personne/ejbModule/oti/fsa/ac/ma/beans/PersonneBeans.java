package oti.fsa.ac.ma.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import oti.fsa.ac.ma.entites.Personne;

/**
 * Session Bean implementation class PersonneBeans
 */
@Stateless

public class PersonneBeans implements PersonneRemote{
	@PersistenceContext(unitName = "Personne")
	
	private EntityManager em;
    public PersonneBeans() {
        
    }

	public void addPersonne(Personne p) {
		em.persist(p);
	}

}
