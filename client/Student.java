package com.capgemini.client;

public class Student {
private int roll_no;
private String Name;
private String city;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll_no, String name, String city) {
	super();
	this.roll_no = roll_no;
	Name = name;
	this.city = city;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
