package com.coforge;

public class Employee {

	
	public int id;
	public String name;
	protected String country;
	public void show()
	{
		System.out.println("Employee data:");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("country:"+country);
	}

}
