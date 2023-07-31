package myfirst;

public class Student {

	public static void main(String[] args) {
		int roll;
		String name,subject1,subject2,grade;
		float m1,m2,total,avg;
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter roll:");
		roll=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter subject1:");
		subject1=sc.next();
		System.out.println("Enter marks:");
		m1=sc.nextFloat();
		System.out.println("Enter subject2:");
		subject2=sc.next();
		System.out.println("Enter marks:");
		m2=sc.nextFloat();
		total=m1+m1;
		avg=total/2;
		
		if(m1<35 || m2<35)
			grade ="fail";
		
		else if(avg>=75 && avg<=100)
			grade="distinction";
		else if(avg>=60 && avg<=75)
			grade="A";
		else if(avg>=50 && avg<=60)
			grade="B";
		
		else if(avg>=35 && avg<=50)
		    grade="C";
		
		else 
			grade="fail";
		
		display_details(roll,name,subject1,subject2,m1,m2,total,avg,grade);
		
		
		

	}
	static void display_details(int r,String n,String s1,String s2,float m1,float m2,float t,float a,
			String g)
	{
		System.out.println("**Student Details**");
		System.out.println("  Roll: "+r);
		System.out.println("  Name: "+n);
		System.out.println("  Subject1: "+s1);
		System.out.println("  Marks1: "+m1);
		System.out.println("  Subject2: "+s2);
		System.out.println("  Marks2: "+m2);
		System.out.println("  Total marks: "+t);
		System.out.println("  Average marks: "+a);
		System.out.println("  Grade: "+g);
		
	} 

}
