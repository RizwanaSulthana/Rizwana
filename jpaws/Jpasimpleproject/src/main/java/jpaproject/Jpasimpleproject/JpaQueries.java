package jpaproject.Jpasimpleproject;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;


public class JpaQueries {
	
	public static void main(String[]args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA1");
		EntityManager em=emf.createEntityManager();
		
        Query q=em.createQuery("from Student s where s.marks>70");
		
		List<Student>list =q.getResultList();
		for (Student s:list) {
			System.out.println(s);
		}
		System.out.println("***************************");
		q=em.createQuery("from Student s where s.studentId=30");
		
		Student s=(Student)q.getSingleResult();
		System.out.println(s);
		
		
		System.out.println(s);
		em.close();
		emf.close();
	}

}
