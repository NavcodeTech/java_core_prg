package myfirst;

public class Circle {

	public static void main(String[] args) {
	
		float radius=456.6f;
		float area=3.14f*radius*radius;
		float circumference=2*3.14f*radius;
		System.out.println(" Radius: "+radius);
		System.out.println(" Area: "+area);
	
		System.out.println(" Circumference: "+circumference);
		System.out.println("\n Radius: "+radius+"\n Area: "+area+"\n Circumference: "+circumference);
		System.out.printf("\n Radius: %f\n Area: %f\n Circumference: %f\n",radius,area,circumference);
	}

}
