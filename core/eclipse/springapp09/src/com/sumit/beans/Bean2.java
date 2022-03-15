package com.sumit.beans;

import java.io.Serializable;

public class Bean2 implements Serializable {
	String name; 
	int age; 
	
	public void customInit() {
		System.out.println("Bean2 initialization through user provided init method");
		name = "Swapnil"; 
		age = 23;
	}
	
	public void customDestroy() {
		System.out.println("Bean2 destruction through user provided destroy method"); 
		name = null;
		age = 0;
	}
	
	public String sayHello() {
		return "Hello " + name + ", " + age; 
	}
}
