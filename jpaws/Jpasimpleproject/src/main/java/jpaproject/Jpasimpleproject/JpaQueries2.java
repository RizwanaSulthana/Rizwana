package jpaproject.Jpasimpleproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class JpaQueries2 {
	
	public static void main(String[]args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA1");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createQuery("from Student s where s.marks > :mks");
		
		q.setParameter("mks", 45.0f);
		
		List<Student> list=q.getResultList();
		
		for(Student s: list) {
			System.out.println(s);
		}
	}

}
