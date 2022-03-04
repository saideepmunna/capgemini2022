package com.Mappings;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;
//import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	private int marks;
//	@OneToOne
//	private Laptop laptop; One student has one laptop
	@OneToMany(mappedBy="student") //mappedBy = student makes it is mapped by student no need to create a seperate Student_laptop table
	private List<Laptop> laptop = new ArrayList<>(); //one student has many laptops
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	//	public Laptop getLaptop() {
//		return laptop;
//	}
//	public void setLaptop(Laptop laptop) {
//		this.laptop = laptop;
//	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
 