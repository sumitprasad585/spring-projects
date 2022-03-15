package com.sumit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sumit.beans.WelcomeBeans;

@Configuration
public class WelcomeConfig {
	@Bean
	public WelcomeBeans welcomeBean() {
		WelcomeBeans wb = new WelcomeBeans(); 
		wb.setName("Sumit");
		return wb; 
	}
}
