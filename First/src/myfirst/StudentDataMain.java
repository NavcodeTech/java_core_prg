package myfirst;
import java.util.*;
public class StudentDataMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student id:");
		int sid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter student name:");
		String sname=sc.nextLine();
		System.out.println("Enter student address:");
		String saddress=sc.nextLine();
		String ch="";
		do
		{
		System.out.println("Whether student is from NIT(Yes/No):");
		ch=sc.nextLine();
		if(!(ch.equals("Yes") || ch.equals("No")))
		{
			System.out.println("Wrong input");
		}
		}while(!(ch.equals("Yes") || ch.equals("No")));
		
		if(ch.equals("Yes"))
		{
		StudentData sd=new StudentData(sid,sname,saddress);
		sd.show_details();
		}
		else
		{
			
			System.out.println("Enter college name:");
			String cname=sc.nextLine();
			StudentData sd=new StudentData(sid,sname,saddress,cname);
			sd.show_details();
		}
		sc.close();
		
		

	}

}
