package org.training.training.demojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.training.training.domaine.Formation;

public class DemoJpa {

	public static void main(String[] args) {
		
		// 1 : Ouverture unit� de travail JPA
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu");
		EntityManager em = emf.createEntityManager();
		
		// 2 : Ouverture transaction 
		EntityTransaction tx =  em.getTransaction();
		tx.begin();
		
		// 3 : Instanciation Objet m�tier
		Formation formation = new Formation();
//		formation.setId(1);
		formation.setTheme("DOCKER");
		
		// 4 : Persistance Objet/Relationnel : cr�ation d'un enregistrement en base
		 em.persist(formation);
		
		// 5 : Fermeture transaction 
		 tx.commit();
		
		// 6 : Fermeture unit� de travail JPA 
		em.close();
		emf.close();	
	}
}
