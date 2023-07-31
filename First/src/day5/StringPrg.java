package day5;

public class StringPrg {

	public static void main(String[] args) {
		String var1="hello"; //create a string pool
		System.out.println(var1);
		
		var1.concat("world");
		System.out.println(var1);
		
		String var2="hello";//create same string pool
		System.out.println(var1==var2);//checks references will be compared
		System.out.println(var1.equals(var2));//checks content
		
		String var3=new String("hello");//create new string pool
		
		System.out.println(var3==var1);
		System.out.println(var3.equals(var1));

	}

}
