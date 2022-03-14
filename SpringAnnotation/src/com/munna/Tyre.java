package com.munna;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;
	private String model;
	

	public Tyre(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + ", model=" + model + "]";
	}
	

}
