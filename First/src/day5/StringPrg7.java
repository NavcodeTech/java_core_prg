package day5;

public class StringPrg7 {
	public static void main(String[] args) {
		String s="hello";
		//StringBuffer sb="hello";//String can't be assigned directly StringBuffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		sb.append(" World");
		System.out.println(sb);
		
		sb.delete(2, 4);
		System.out.println(sb);
		sb.insert(3, " greeting ");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
	}
}
