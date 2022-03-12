package com.sumit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sumit.beans.Employee;

public class Test {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("com/sumit/resources/beanFactory.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Employee employeeBean = (Employee) beanFactory.getBean("employeeBean");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sumit/resources/applicationContext.xml");
	}

}
