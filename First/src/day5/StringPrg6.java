package day5;

public class StringPrg6 {

	public static void main(String[] args) {
		String var="Nitin";
		
		char arrChar[]=var.toCharArray();
		
		char ar[]=new char[arrChar.length];
		
		int x=0;
		
		for(int i=arrChar.length-1;i>=0;i--)
		{
			ar[x]=arrChar[i];
			x++;
		}
		
		String rev=new String(ar);
		System.out.println("reverse="+rev);
		
		System.out.println("is pallindrome:"+rev.equals(var));
		
	}

}
