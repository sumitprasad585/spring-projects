package com.sumit.beans;

import java.io.Serializable;

public class WelcomeBeans implements Serializable {
	String name; 
	public WelcomeBeans() {
		System.out.println("Welcome bean class instanciation");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String sayWelcome() {
		return "Welcome! " + name; 
	}
}
