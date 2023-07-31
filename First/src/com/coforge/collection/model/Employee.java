package com.coforge.collection.model;

public class Employee {
	private int empId;
	private String empName;
	private float empSal;
	public Employee(int empId, String empName, float empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public float getEmpSal() {
		return empSal;
	}
	
}
