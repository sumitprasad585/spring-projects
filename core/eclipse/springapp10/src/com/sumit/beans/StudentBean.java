package com.sumit.beans;

import java.io.Serializable;

public class StudentBean implements Serializable {
	String name; 
	int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	} 
	
	public String StudentDetails() {
		return "Student : " + name  + ", " + roll; 
	}
	
	public void init() {
		System.out.println("Student bean custom init initialization");
	}
	public void destroy() {
		System.out.println("Student bean destuction using destroy method");
	}
}
