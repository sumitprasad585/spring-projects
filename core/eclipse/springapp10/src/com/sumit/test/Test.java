package com.sumit.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.EmployeeBean;
import com.sumit.beans.StudentBean;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		StudentBean studentBean = (StudentBean)context.getBean("studentBean");
		EmployeeBean employeeBean = (EmployeeBean)context.getBean("employeeBean");
		
		System.out.println(studentBean.StudentDetails());
		System.out.println(employeeBean.employeeDetails());
		
		context.registerShutdownHook();
	}
}
