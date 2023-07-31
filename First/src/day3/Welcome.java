package day3;

public abstract class Welcome {
	int x;
	int y;
	abstract void show();
	void info()
	{
		System.out.println("Info about abstract.");
	}
	
	

}
class Greeting extends Welcome
{
	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("This is show method implemented in greeting class");
		System.out.println("x is "+x);
		System.out.println("y is "+y);
	}
	public static void main(String[] args) {
		Welcome w=new Greeting();
		Greeting gr=new Greeting();
		w.x=10;
		w.y=20;
		w.show();
		w.info();
	}
}
