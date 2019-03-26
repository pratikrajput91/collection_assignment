package com.capgemini.client;

import java.util.Objects;

public class Cellphone {
	private String company;
	private String model;
	private String description;
	private String os;
	private double price;
	public Cellphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cellphone(String company, String model, String description, String os, double price) {
		super();
		this.company = company;
		this.model = model;
		this.description = description;
		this.os = os;
		this.price = price;
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(company,model,os);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Cellphone) {
			return false;
		}
		
		
		Cellphone cellphone = (Cellphone) obj;
		if(this.company==cellphone.company && this.model==cellphone.model && this.os==cellphone.os) {
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
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

}
	


