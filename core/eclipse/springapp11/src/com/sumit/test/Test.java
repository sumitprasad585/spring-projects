package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sumit.beans.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
		Employee emp = (Employee)context.getBean("employeeBean");
		emp.showEmployeeDetails();
		
	}
}
