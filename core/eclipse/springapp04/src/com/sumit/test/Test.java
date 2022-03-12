package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.HelloBean;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		HelloBean helloBean = (HelloBean)context.getBean("helloBean");
		helloBean.sayHello();
		
		HelloBean helloBean1 = (HelloBean)context.getBean("helloBean1");
		HelloBean helloBean2 = (HelloBean)context.getBean("helloBean2");
		HelloBean helloBean3 = (HelloBean)context.getBean("helloBean3"); 
		
		helloBean1.sayHello(); 
		helloBean2.sayHello(); 
		helloBean3.sayHello();
		
		System.out.println(helloBean == helloBean1);
		System.out.println(helloBean1 == helloBean3);
		System.out.println(helloBean2 == helloBean3); 
		
		HelloBean hi = (HelloBean)context.getBean("hi");
		hi.sayHello();
		HelloBean hi1 = (HelloBean)context.getBean("hi1");
		hi1.sayHello();
	}
}
