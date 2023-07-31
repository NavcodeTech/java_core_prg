package day5;

public class StringPrg5 {

	public static void main(String[] args) {
		String var="we are learning java";
		
		System.out.println(var.indexOf("java"));
		
		String replaced=var.replace('e', 'z');
		System.out.println(replaced);
		System.out.println(var.replaceAll("java","Python"));
		System.out.println(var.contains("are"));
		
		String var2=" hello world";
		System.out.println(var2.length());
		String trimed=var2.trim();
		System.out.println(var2);
		System.out.println(trimed);
		System.out.println(trimed.length());
	}

}
