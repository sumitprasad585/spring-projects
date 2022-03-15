package com.sumit.beans;

import java.io.Serializable;

public class HelloBeans implements Serializable {
	public String sayHello() {
		return "Hello Beans! " + this.hashCode();
	}

}
