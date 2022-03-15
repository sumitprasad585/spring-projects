package com.sumit.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.Bean1;
import com.sumit.beans.Bean2;
import com.sumit.beans.Bean3;
import com.sumit.beans.Bean4;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		Bean1 bean1 = (Bean1)context.getBean("bean1");
		System.out.println(bean1.sayHello());
		
		Bean2 bean2 = (Bean2)context.getBean("bean2");
		System.out.println(bean2.sayHello());
		
		Bean3 bean3 = (Bean3)context.getBean("bean3");
		System.out.println(bean3.sayHello());
		
		Bean4 bean4 = (Bean4)context.getBean("bean4");
		System.out.println(bean4.sayHello());
		
		context.registerShutdownHook();
	}
}
