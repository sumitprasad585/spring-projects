package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		Student studentBean = (Student)context.getBean("studentBean");
		System.out.println(studentBean.studentDetails());
	}
}
