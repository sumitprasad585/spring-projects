package com.sumit.beans;

import java.io.Serializable;

public class Account implements Serializable {
	String accountNumber; 
	String accountHolderName; 
	String accountType;
	double balance; 
	String accountHolderEmail;  
	String accountHolderMobile;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccountHolderEmail() {
		return accountHolderEmail;
	}
	public void setAccountHolderEmail(String accountHolderEmail) {
		this.accountHolderEmail = accountHolderEmail;
	}
	public String getAccountHolderMobile() {
		return accountHolderMobile;
	}
	public void setAccountHolderMobile(String accountHolderMobile) {
		this.accountHolderMobile = accountHolderMobile;
	}
	
	public void showAccountDetails() {
		System.out.println("Account Holder Name : " + accountHolderName); 
		System.out.println("Account Number : " + accountNumber); 
		System.out.println("Account Type : " + accountType);
		System.out.println("Balance : " + balance); 
		System.out.println("Account Holder Email : " + accountHolderEmail); 
		System.out.println("Account Holder Mobile : " + accountHolderMobile);
	}
	
}
