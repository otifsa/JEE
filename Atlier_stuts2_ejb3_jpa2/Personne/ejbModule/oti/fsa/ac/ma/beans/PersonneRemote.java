package oti.fsa.ac.ma.beans;

import javax.ejb.Remote;

import oti.fsa.ac.ma.entites.Personne;
@Remote
public interface PersonneRemote {
  public void addPersonne(Personne p);
}
