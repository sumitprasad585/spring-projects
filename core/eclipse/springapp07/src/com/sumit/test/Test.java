package com.sumit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sumit.beans.WelcomeBeans;
import com.sumit.config.WelcomeConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(WelcomeConfig.class);
		WelcomeBeans welcome1 = (WelcomeBeans)context.getBean("welcomeBean");
		System.out.println(welcome1.sayWelcome());
	}
}
