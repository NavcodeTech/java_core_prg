package day5;

public class StringPrg3 {
	public static void main(String[] args) {
		String var1="We are learning java";
		System.out.println(var1.length());
		System.out.println(var1.concat("then we will learn spring"));
		char c1=var1.charAt(0);
		System.out.println(c1);
		 
		for(int i=0;i<var1.length();i++)
		{
			System.out.println(var1.charAt(i));
		}
		System.out.println();
		
		String []splits=var1.split(" ");
		for(String s:splits)
		{
			System.out.println(s);
		}
		String var2="hello-how&are@you.i am#fine";
		for(String s1:var2.split("-|&|@|#| "))
			System.out.println(s1);
	}
}
