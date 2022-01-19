package jpaproject.Jpasimpleproject;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class JpanamedQueries {

	public static void main(String[] args) {
		

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA1");
		EntityManager em=emf.createEntityManager();
		
		Query q=em.createNamedQuery("findAllStudents");
		
		List<Student> list=q.getResultList();
		System.out.println("==========list of all students==========");
		for(Student s : list) {
			System.out.println(s);
		}
		q=em.createNamedQuery("findfailedstudents");
		
		q.setParameter("passmarks" ,60.0f);

		List<Student> passList=q.getResultList();
		System.out.println("==========list of failed students==========");
		for(Student s : passList) {
			System.out.println(s);
		}
		
        q=em.createNamedQuery("findtopstudents");
		
		q.setParameter("topmarks" ,90.0f);

		List<Student> topList=q.getResultList();
		System.out.println("==========list of top students==========");
		for(Student s : topList) {
			System.out.println(s);
		}
		}
	}


