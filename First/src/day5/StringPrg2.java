package day5;

import java.util.Scanner;

public class StringPrg2 {

	public static void main(String[] args) {
		System.out.println("hello"=="hello");//both will refer same object in string pool
		System.out.println("hello"==new String("hello"));//both will refer different string pool
		
		System.out.println("Enter name");
		String n1="ram";
		//using scanner class
		String n2=new Scanner(System.in).next();
		System.out.println(n1==n2);
		System.out.println(n1.equals(n2));
	}

}
