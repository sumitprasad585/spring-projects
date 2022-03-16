package com.sumit.processor; 

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.sumit.beans.Account;

public class AccountPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		Account acc = (Account) bean;
		if(acc.getAccountType() == null) {
			acc.setAccountType("Saving");
		}
		return acc;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		Account acc = (Account) bean; 
		String mail = acc.getAccountHolderEmail();
		String mobile = acc.getAccountHolderMobile();
		if(!mail.contains("@")) {
			mail += "@gmail.com";
			acc.setAccountHolderEmail(mail);
		}
		if(!mobile.contains("+91-")) {
			mobile = "+91-"  + mobile; 
			acc.setAccountHolderMobile(mobile);
		}
		return acc; 
	}
}
