package com.sumit.beans;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	String name; 
	int empid;
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
	
	public String employeeDetails() {
		return "Employee : " + name + ", "  + empid;
	}
	
	public void init() {
		System.out.println("Employee bean initialization through init");
	}
	
	public void destroy() {
		System.out.println("Employee bean destructio using destory method");;
	}
}
