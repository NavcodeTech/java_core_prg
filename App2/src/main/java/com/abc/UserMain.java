package com.abc;

import com.coforge.User;
public class UserMain {


	public static void main(String[] args) {
		User user=new User(1001,"Amit kumar",32000);
		System.out.println("User Data:");
		System.out.println("Id:"+user.getUserId());
		System.out.println("Name:"+user.getUserName());
		System.out.println("Salary:"+user.getUserSalary());

	}

}
