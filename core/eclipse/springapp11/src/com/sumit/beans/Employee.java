package com.sumit.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	String name; 
	int empid; 
	int age; 
	Account acc;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	} 
	
	public void showEmployeeDetails() {
		System.out.println(empid);
		System.out.println(name + ", " + age);
		System.out.println("Account Number : " + acc.accountNumber);
		System.out.println("IFSC : " + acc.ifsc);
	}
	
}
