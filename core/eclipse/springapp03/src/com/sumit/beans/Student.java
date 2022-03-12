package com.sumit.beans;

import java.io.Serializable;

public class Student implements Serializable{
	String name; 
	int roll; 
	static { 
		System.out.println("Student Bean class loading...");
	}
	
	public Student() {
		System.out.println("Student Bean class instanciation");
	}

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

}
