package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.HelloBean;
import com.sumit.scopes.ThreadScope;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		HelloBean hello1 = (HelloBean)context.getBean("helloBean");
		HelloBean hello2 = (HelloBean)context.getBean("helloBean");
		System.out.println(hello1);
		System.out.println(hello2);
		System.out.println(hello1 == hello2);
		System.out.println(hello1.sayHello());
		System.out.println(hello2.sayHello());
		
		ThreadScope threadScope = (ThreadScope)context.getBean("threadScope");
		HelloBean hello3 = (HelloBean)threadScope.remove("helloBean");
		System.out.println(hello3);
		
		HelloBean hello4 = (HelloBean)context.getBean("helloBean");
		HelloBean hello5 = (HelloBean)context.getBean("helloBean");
		System.out.println(hello4);
		System.out.println(hello5);
		System.out.println(hello4 == hello5);
		System.out.println(hello4.sayHello());
		System.out.println(hello5.sayHello());
		
	}
}
