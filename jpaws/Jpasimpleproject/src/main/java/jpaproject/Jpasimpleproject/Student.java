package jpaproject.Jpasimpleproject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="std_tbl")
@NamedQueries(
		{
			@NamedQuery(name="findAllStudents",query=" from Student"),
			@NamedQuery(name="findFailedStudents",query=" from Student s where s.marks < :passmarks"),
            @NamedQuery(name="findTopStudents",query=" from Student s where s > :topmarks")
	    
		
		}
		)

public class Student {
	@Id
	@Column(name="stdid",columnDefinition="number(3)")
	//@GeneratedValue
	private int studentId;
	@Column(length=15)
	private String name;
	@Column(columnDefinition = "number(5,2)")
	private float marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int studentId, String name, float marks) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.marks = marks;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "StudentId=" + studentId + ", name=" + name + ", marks=" + marks;
	}
	
	

}
