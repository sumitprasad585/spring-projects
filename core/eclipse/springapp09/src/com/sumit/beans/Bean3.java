package com.sumit.beans;

import java.io.Serializable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean3 implements Serializable, InitializingBean, DisposableBean {
	String name; 
	int age; 
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean3 initialization through afterPropertiesSet() of InitializingBean callback interface");
		name = "Vijay"; 
		age = 22;
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean3 destruction through destory() of DisposableBean callback interface");
		name = null; 
		age = 0;		
	}
	
	public String sayHello() {
		return "Hello " + name + " , "  + age;
	}
}
