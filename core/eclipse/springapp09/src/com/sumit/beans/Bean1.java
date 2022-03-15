package com.sumit.beans;

import java.io.Serializable;

public class Bean1 implements Serializable{
	String name; 
	int age; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Bean1 initialization through setter method");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		System.out.println("Bean1 initialization through setter method");
		this.age = age;
	}
	
	public String sayHello() {
		return "Hello " + name + ", " + age;
	}
}
