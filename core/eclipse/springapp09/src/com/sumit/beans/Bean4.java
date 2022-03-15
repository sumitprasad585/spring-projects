package com.sumit.beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Bean4 implements Serializable {
	String name; 
	int age; 
	
	@PostConstruct
	public void init() {
		System.out.println("Bean4 initialization through @PostContruct annotation from javax.annotation API");
		name = "Darshan"; 
		age = 20;
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("Bean4 destruction through @PreDestroy annotation from javax.annotation ");
		name = null; 
		age = 0;
	}
	
	public String sayHello() {
		return "Hello " + name + "," + age;
	}
}