package com.demo.pojo;

public class Message {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void show() {
		System.out.println("Called show() without creating object of Message with Message constructor");
	}
	

}
