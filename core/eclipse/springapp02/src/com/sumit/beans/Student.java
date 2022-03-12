package com.sumit.beans;

import java.io.Serializable;

public class Student implements Serializable{
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
	public String studentDetails() {
		String details = this.name + " " + this.roll; 
		return details;
	}
}
