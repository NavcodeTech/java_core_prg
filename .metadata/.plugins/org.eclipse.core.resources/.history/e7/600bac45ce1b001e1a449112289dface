package com.example.exception;
import java.util.*;
public class ExcptionProg3 {

	public static void main(String[] args) {
		Scanner sc = null;
		try
		{
			 sc=new Scanner(System.in);
			
			//Integer x="null";
			Integer x=sc.nextInt();
			System.out.println(x);
			System.out.println(x.toString());
			int ar[]= {1,2,3,4};
			System.out.println(ar[5]);
		}
		catch(NullPointerException|ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			sc.close();
			System.out.println("finally block.");
		}
	}

}
