package myfirst;

public class Addition {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int x,y,z;
		System.out.println("Enter first number:");
		x=sc.nextInt();
		System.out.println("Enter Second number:");
		y=sc.nextInt();
		z=x+y;
		System.out.println("Addition of number "+x+" and "+y+" is: "+z);
		System.out.printf("\nsum of %d and %d is %d",x,y,z);
		
		
	}

}
