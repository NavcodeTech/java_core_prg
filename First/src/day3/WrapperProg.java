package day3;

public class WrapperProg {
public static void main(String[] args) {
	int x=100;
	Integer p1=new Integer(x);//boxing
	int intvalue= p1.intValue();//unboxing
	
	intvalue++;
	intvalue++;
	p1=new Integer(intvalue);
	System.out.println(p1);
	
	Integer p2=x;
	p2++; //autoboxing-wrapper to primitive=boxing+unboxing;
	System.out.println(p2);
	
	String s1="123";
	int p3=Integer.parseInt(s1);
	System.out.println(p3);
	
	float f1=Float.parseFloat("234.5f");
	System.out.println(f1);
	
	String binString= Integer.toBinaryString(intvalue);
	String octString= Integer.toOctalString(intvalue);
	String hexString= Integer.toHexString(intvalue);
	
	System.out.println(intvalue);
	System.out.println(binString);
	System.out.println(octString);
	System.out.println(hexString);
	
	Integer val1=Integer.valueOf(123);
	Integer val2=Integer.valueOf("345");
	System.out.println(val1);
	System.out.println(val2);
}
}
