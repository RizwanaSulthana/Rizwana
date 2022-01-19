package jpaproject.Jpasimpleproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain2 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA1");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		
		Student std=em.find(Student.class, 10);
		System.out.println(std);
		std.setMarks(55);
		em.merge(std);
		
		Student std1=em.find(Student.class, 40);
		em.remove(std1);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
