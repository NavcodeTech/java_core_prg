package day3;

public class TypeCastProg {
	public static void main(String[] args) {
		int x=100;
		float p1=x; //implicit casting,widening
		
		byte b1=(byte) x;//explicit casting,Narrowing
		System.out.println(x);
		System.out.println(b1);
		System.out.println(p1);
		
		Number n1=88787;
		Float f1=(Float)n1;//class cast exception
		//Float f1=2334.5f;
		n1=f1;//lower to higher//, no need to cast
		System.out.println(f1);
		System.out.println(n1);
		
	}
}
