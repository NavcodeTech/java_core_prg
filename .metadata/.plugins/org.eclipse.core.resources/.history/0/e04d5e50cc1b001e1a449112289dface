package com.example.exception;

public class ExcptionHandlingPrg2 {

	public static void main(String[] args) {
		System.out.println("Program Starts..");
		/*try
		{
			int x=10/0;
		}
		catch(Exception e)
		{
			System.err.println(e);
			System.err.println(e.getMessage());
			e.printStackTrace();
			System.err.println("Divided by zero error ");
		}
		try
		{
			String age="75a";
			int a=Integer.parseInt(age);
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}*/
		
		try
		{
			int x=10/0;
		}
		catch(ArithmeticException e)
		{
			System.err.println("Divided by zero");
			
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		try
		{
			String age="75a";
			int a=Integer.parseInt(age);
			System.out.println(a);
		}
		catch(NumberFormatException e)
		{
			System.err.println("Number format Exception");
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}
		System.out.println("Program ends");
	}

}
