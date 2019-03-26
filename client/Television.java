package com.capgemini.client;

import java.util.Objects;

public class Television {
	private String company;
	private String type;
	private Boolean enabled3D;
	private double price;
	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Television(String company, String type, Boolean enabled3d, double price) {
		super();
		this.company = company;
		this.type = type;
		enabled3D = enabled3d;
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(company,type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Television) {
			return false;
		}
		
		
		Television television = (Television) obj;
		if(this.company==television.company && this.type==television.type) {
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

	public String getType() {
		return type;
	}

	public void setType(String model) {
		this.type = type;
	}
	


}

