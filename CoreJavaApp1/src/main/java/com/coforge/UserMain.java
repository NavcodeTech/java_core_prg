package com.coforge;

public class UserMain {
	public static void main(String[] args) {
		User user=new User(1001,"Sunil Kumar",12000);
		System.out.println("User Information:");
		System.out.println("Id:"+user.getUserId());
		System.out.println("Name:"+user.getUserName());
		System.out.println("Salary:"+user.getUserSalary());
	}
}
