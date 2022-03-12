package com.sumit.beans;

import java.io.Serializable;

public class HelloBean implements Serializable {
	public void sayHello() {
		System.out.println("Hello from bean object, Object hashCode = " + this.hashCode());
	}
}
