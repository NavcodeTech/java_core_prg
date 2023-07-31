package myfirst;
import java.util.*;
public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id,name,salary");
		p1.setId(sc.nextInt());
		sc.nextLine();
		p1.setName(sc.nextLine());
		p1.setSalary(sc.nextFloat());
		
		System.out.println("Person data:");
		System.out.println("Person's ID:"+p1.getId());
		System.out.println("Person's Name:"+p1.getName());
		System.out.println("Person's Salary:"+p1.getSalary());

	}

}
