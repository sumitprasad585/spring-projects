package com.sumit.beans;

import java.io.Serializable;

public class Bean2 implements Serializable {
	public static Bean2 getBean2Instance() {
		System.out.println("Bean2 instantiation through static factory method");
		return new Bean2();
	}
}
