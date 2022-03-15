package com.sumit.beans;

import java.io.Serializable;

public class HelloBean implements Serializable {
	public HelloBean() {
		System.out.println("HelloBean object created");
	}
	public String sayHello() {
		return "Hello user from " + Thread.currentThread().getName() + " scope";
	}
}
