package myfirst;

public class Calculator {
    
	static int addition(int a,int b) {
		return a+b;
	}
	static int subtraction(int a,int b) {
		return a-b;
	}
	static int division(int a,int b) {
		return a/b;
	}
	static int multiplication(int a,int b) {
		return a*b;
	}
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int x,y,sum_result;
		System.out.println("Enter first number:");
		x=sc.nextInt();
		System.out.println("Enter Second number:");
		y=sc.nextInt();
		sum_result=addition(x,y);
		int sub_result=subtraction(x,y);
		int mul_result=multiplication(x,y);
		int div_result=division(x,y);
		
		System.out.println("Addition of number "+x+" and "+y+" is: "+sum_result);
		System.out.println("Subtractiontion of number "+x+" and "+y+" is: "+sub_result);
		System.out.println("Multiplication of number "+x+" and "+y+" is: "+mul_result);
		System.out.println("Addition of number "+x+" and "+y+" is: "+div_result);

	}

}
