package day3;

public class VarArgsPrg1 {
	static void display(int a,int b,int... c)
	{
		System.out.println(a);
		System.out.println(b);
		
		for(int i:c)
		{
			System.out.print(i+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		display(1,2,3);
		display(1,2,3,4,5);
		display(1,2,arr);
	}
}
