package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.HelloBeans;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		HelloBeans hello1 = (HelloBeans)context.getBean("helloBeanSingleton");
		HelloBeans hello2 = (HelloBeans)context.getBean("helloBeanSingleton");
		HelloBeans hello3 = (HelloBeans)context.getBean("helloBeanSingleton");
		System.out.println("Singleton Scope");
		System.out.println(hello1.sayHello()); 
		System.out.println(hello2.sayHello());
		System.out.println(hello3.sayHello());
		
		HelloBeans hello4 = (HelloBeans)context.getBean("helloBeanPrototype");
		HelloBeans hello5 = (HelloBeans)context.getBean("helloBeanPrototype");
		HelloBeans hello6 = (HelloBeans)context.getBean("helloBeanPrototype");
		System.out.println("Prototype Scope");
		System.out.println(hello4.sayHello());
		System.out.println(hello5.sayHello());
		System.out.println(hello6.sayHello());
	}
}
