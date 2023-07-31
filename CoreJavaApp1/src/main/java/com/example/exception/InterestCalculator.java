package com.example.exception;

import java.util.Scanner;

public class InterestCalculator {
	float amount;
	float rate;
	int time;
	Scanner sc=null;
	float interest() throws Exception
	{
		System.out.println("Enter amount:");
		sc=new Scanner(System.in);
		amount=sc.nextFloat();
		if(amount<=0)
			throw new Exception("Invalid amount");
		System.out.println("Enter rate:");
		rate=sc.nextFloat();
		
		if(rate<=0)
			throw new Exception("Invalid rate");
		System.out.println("Enter year:");
		time=sc.nextInt();
		
		try {
		if(time<=0)
			throw new Exception("Invalid time");
		}
		catch(Exception e)
		{
			System.out.println("Interest method catch");
			System.err.println(e.getMessage());
			throw e;
		}
		return amount*rate*time;
		
	}
	public static void main(String[] args) {
		InterestCalculator i=new InterestCalculator();
		try
		{
			System.out.println("Interest caluculated="+i.interest());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
