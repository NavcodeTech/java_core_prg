package com.example;

import com.coforge.Employee;

public class EmployeeMain extends Employee{

	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="Sunny";//name is not public so error
		emp1.id=10077;
		System.out.println("country is"+new EmployeeMain().country);
		emp1.show();
		

	}

}