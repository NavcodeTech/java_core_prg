package day2;

class A
{
	public A()
	{
		super();
		System.out.println("A class constructor");
	}
	
}
class B extends A
{
	public B()
	{
		super();
		System.out.println("B class constructor");
	}
}
public class C extends B {
	public C()
	{
		super();
		System.out.println("C class Constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}
