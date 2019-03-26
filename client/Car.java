package com.capgemini.client;

import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private String year;
	private String price;
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String make, String model, String year, String price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(make,model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Laptop) {
			return false;
		}
		
		
		Car car = (Car) obj;
		if(this.make==car.make && this.model==car.model) {
			return true;
		}
	
		return false;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String company) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}


