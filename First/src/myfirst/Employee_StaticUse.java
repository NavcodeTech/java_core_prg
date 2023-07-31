package myfirst;

public class Employee_StaticUse {
	int employeeId;//instance variable
	String empName;//instance variable
	float empSalary;//instance variable
	static String country;//static variable
	static
	{
		country="India";
		System.out.println("Static block is called");
	}
	static
	{
		country="Bharat";
		System.out.println("Static block is called");
	}
	public Employee_StaticUse()
	{
		System.out.println("Constructor is called");
		this.employeeId=1001;
		this.empName="Naveen";
		this.empSalary=90000.0f;
		
	}
	public void employeeInfo()
	{
		System.out.println("Employee data:");
		System.out.println("Employee's Id:"+employeeId);
		System.out.println("employee's Name:"+empName);
		System.out.println("employee's Salary:"+empSalary);
		System.out.println("Country:"+country);
	}
	public static void employeeInfo1(Employee_StaticUse emp)
	{
		System.out.println("Employee data:");
		System.out.println("Employee's Id:"+emp.employeeId);
		System.out.println("employee's Name:"+emp.empName);
		System.out.println("employee's Salary:"+emp.empSalary);
		System.out.println("Country:"+country);
	}
	
	

}
