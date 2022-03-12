package com.sumit.beans;

import java.io.Serializable;

public class Employee implements Serializable {
	String ename; 
	int eid; 
	
	static { 
		System.out.println("Employee Bean class loading...");
	}
	
	public Employee() {
		System.out.println("Employee Bean class instanciation");
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}
	
}
