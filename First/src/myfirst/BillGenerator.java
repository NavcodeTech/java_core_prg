package myfirst;

public class BillGenerator {

	public static void main(String[] args) {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	  System.out.println("Enter the no of pizzas bought:");
	  int pizza=sc.nextInt();
	  System.out.println("Enter the no. of puffs bought:");
	  int puff=sc.nextInt();
	  System.out.println("Enter the no of cool drinks bought:");
	  int cd=sc.nextInt();
	  
	  int price=pizza*100+puff*20+cd*10;
	  System.out.println("Bill details");
	  System.out.println("No of pizzas:"+pizza);
	  System.out.println("No of puffs:"+puff);
	  System.out.println("No of cooldrinks:"+cd);
	  System.out.println("Toatl Price="+price);
	}

}
