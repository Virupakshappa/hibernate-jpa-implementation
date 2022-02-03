package com.janadri.JpaProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		/** uncomment to add the data */
//    	Alien a = new Alien();
//    	a.setNid(5);
//    	a.setNname("Manvith");
//    	a.setNtech("Big Data");
    	
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpapu");
    	EntityManager em = emf.createEntityManager();
    	
//    	em.getTransaction().begin();
//    	em.persist(a);
//    	em.getTransaction().commit();
    	
    	/** to fetch the data */
    	Alien a = em.find(Alien.class,2);
    	System.out.println(a);
    }
}
