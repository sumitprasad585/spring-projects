package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.HelloBean;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/beans.xml");
		HelloBean bean = (HelloBean)context.getBean("helloBean");
		System.out.println(bean.sayHello());
	}

}
