package jpaproject.Jpasimpleproject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaMain {
	
	public static void main(String[]args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA1");
		EntityManager em=emf.createEntityManager();
		
		Student s1=new Student(10,"riz",60);
		Student s2=new Student(20,"raj",50);
		Student s3=new Student(30,"abc",30.8f);
		Student s4=new Student(40,"xyz",50.2f);
		Student s5=new Student(50,"naaz",59);
		Student s6=new Student(60,"rani",98);
		Student s7=new Student(70,"raja",78);
		Student s8=new Student(80,"kartik",80);
		Student s9=new Student(90,"rajesh",56);
		
		em.getTransaction().begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		em.persist(s5);
		em.persist(s6);
		em.persist(s7);
		em.persist(s8);
		em.persist(s9);
		em.getTransaction().commit();
		
		System.out.println("two objects saved to database");
		em.close();
		emf.close();
	}

}
