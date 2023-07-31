package myfirst;

public class If {

	public static void main(String[] args) {
		int x=10;
		if(x%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
		int marks=67;
		String res=(marks>=35 ? "pass":"fail");
		System.out.println(res);

	}

}
