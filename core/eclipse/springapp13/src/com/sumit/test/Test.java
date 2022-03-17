package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.Subject;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		
		Subject subject = (Subject) context.getBean("subjectBean");
		subject.showSubjectDetails();
		
		Subject subject1 = (Subject) context.getBean("subjectBean1");
		subject1.showSubjectDetails();
		
		Subject subject2 = (Subject) context.getBean("subjectBean2");
		subject2.showSubjectDetails();
		
		
		Subject subject3 = (Subject) context.getBean("subjectBean3");
		subject3.showSubjectDetails();
	}
}
