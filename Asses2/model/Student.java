package com.abc.model;

public class Student {
	int roll;
	String name,standard,dob;
	double fees;
	
	
	
	
	public Student(int roll, String name, String standard, String dob, double fees) {
		super();
		this.roll = roll;
		this.name = name;
		this.standard = standard;
		this.dob = dob;
		this.fees = fees;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
}
