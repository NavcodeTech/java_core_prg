package com.example.exception;

public class ExceptionProg1 {

	public static void main(String[] args) {
		System.out.println("Program start");
		double x=10.0/0.0;
		x=-10.0/0.0;
		System.out.println(x);
		//int y=10/0;//Arithmetic Exception
		//System.out.println(y);
		
		int arr[]= {1,2,3,4};
		//System.out.println(arr[4]);/ArrayOutOfBoundsException
		System.out.println(arr[2]);
		
		String s1=null;
		//System.out.println(s1.length());//NullPointerException
		
		Integer p1=1000;
		Integer p2=null;
		System.out.println(p1);
		System.out.println(p2);
		
		String s2="hello";
		//System.out.println(s2.charAt(5));//String index out of bounds
		
		String age="75a";
		//int age1=Integer.parseInt(age);/NumberFormatException
		
		System.out.println("end of program.. ");
	}

}
