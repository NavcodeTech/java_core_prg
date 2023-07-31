package day3;

public class Test5 {
	int id;
	String name;
	final String country;
	
	public Test5()
	{
		this.id=9898;
		this.country="India";
		this.name="Shyam Kumar";
	}
	void info()
	{
		System.out.println("Id is:"+id);
		System.out.println("name is"+name);
		System.out.println("country is"+country);
	}
	public static void main(String[] args) {
		Test5 t=new Test5();
		t.info();
		//t.country="Brazil"; //it will give error as it's declared final
		int x=1000;
	}

}
