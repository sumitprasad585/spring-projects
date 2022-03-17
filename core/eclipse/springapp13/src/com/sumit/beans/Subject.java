package com.sumit.beans;

import java.io.Serializable;

public class Subject implements Serializable {
	String subjectName; 
	String subjectId; 
	int marks; 
	public Subject() {
		System.out.println("0 argument constructor");
	}
	
	public Subject(String subjectId) {
		System.out.println("1 argument constructor"); 
		this.subjectId = subjectId;
	}
	public Subject(String subjectName, String subjectId) {
		System.out.println("2 arguments constructor"); 
		this.subjectName = subjectName; 
		this.subjectId = subjectId;
	}
	public Subject(String subjectName, String subjectId, int marks) {
		System.out.println("3 argugments constructor");
		this.subjectId = subjectId; 
		this.subjectName = subjectName; 
		this.marks = marks;
	}
	public String getSubjectName() {
		return subjectName; 
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectId() {
		return subjectId; 
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public void showSubjectDetails() {
		System.out.println(subjectId + " " + subjectName + " " + marks);
	}
}
