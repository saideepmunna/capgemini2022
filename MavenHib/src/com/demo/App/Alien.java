package com.demo.App;

import javax.persistence.*;

@Entity //allows Alien class to store in Database
public class Alien {
	@Id
	private int aid;
	private String aName;
	private String color;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
