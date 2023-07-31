package day6;

interface Calculation1
{
	void addition(int a,int b);
}
interface Calculation2
{
	int subtraction(int a,int b);
}
public class Anonymous {
	public static void main(String[] args) {
		Calculation1 c=new Calculation1() {
			
			@Override
			public void addition(int a, int b) {
				System.out.println("Addition is "+(a+b));
				
			}
		};
		
		Calculation1 c1=(x,y)->{System.out.println("sum is "+(x+y));};
		c.addition(11, 2);
		c1.addition(23, 4);
		
		Calculation2 c3=(p,q)->p-q;
		System.out.println("Subtraction is "+c3.subtraction(40, 10));
		
		
	}
}
