package com.DemoMaven;

import javax.persistence.*;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

@Entity //To change the Entity name (name="Alien_Table")
@Table(name="Alien_Table") //Changes just the name of the table
public class MyAlien {
	@Id
	private int aid;
	//@Transient Removes particular column from the table 
	private AlienName aName;
	@Column(name="Alien_color")
	private String color;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public AlienName getaName() {
		return aName;
	}
	public void setaName(AlienName name) {
		this.aName = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "MyAlien [aid=" + aid + ", aName=" + aName + ", color=" + color + "]";
	}
	
}
