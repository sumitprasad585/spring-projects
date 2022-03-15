package com.sumit.beans;

public class Bean3Factory {
	public Bean3 getBean3Instance() {
		System.out.println("Bean3 instantiation through instance factory method");
		return new Bean3();
	}
}
