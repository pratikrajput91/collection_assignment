package com.capgemini.client;

import java.util.Objects;

public class Laptop {
	private String company;
	private String model;
	private String os;
	private String processor;
	
	public Laptop(String company, String model, String os, String processor) {
		super();
		this.company = company;
		this.model = model;
		this.os = os;
		this.processor = processor;
	}

	public Laptop() {
		super();
		
	}

	@Override
	public int hashCode() {
		
		return Objects.hash(company,model);
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
		
		
		Laptop laptop = (Laptop) obj;
		if(this.company==laptop.company && this.model==laptop.model) {
			return true;
		}
	
		return false;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
