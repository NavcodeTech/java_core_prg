package com.coforge.collection.dao;

import java.util.HashSet;
import java.util.Set;

import com.coforge.collection.model.Employee;


public class EmployeeOperation {
	Set<Employee> empSet;
	public EmployeeOperation()
	{
		empSet=new HashSet<>();
	}
	public Employee searchEmp(Employee emp)
	{
		if(empSet.contains(emp))
			return emp;
		return null;
	}
	public boolean addEmp(Employee emp)
	{
		if(searchEmp(emp)==null)
		{
			empSet.add(emp);
		    return true;
		}
		else 
			return false;
	}
	public void empDetailsById(int id)
	{
		boolean flag=false;
		for(Employee e:empSet)
		{
			if(e.getEmpId()==id)
			{
				System.out.println("Employee Details:");
				System.out.println("Employee's Id:"+e.getEmpId());
				System.out.println("Employee's Name:"+e.getEmpName());
				System.out.println("Employee's Salary"+e.getEmpSal());
				flag=true;
				break;
			}
			
		}
		if(!flag)
			System.out.println("employee Id not fou nd");
	}
	public Set<Employee> getAllEmployee()
	{
		return empSet;
	}
}
