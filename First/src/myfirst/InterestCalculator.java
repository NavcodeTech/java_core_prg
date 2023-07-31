package myfirst;

public class InterestCalculator {

	public static void main(String[] args) {
		float amount=2000.0f;
		float rate=0.08f;
		int time=5;
		System.out.println(amount);
		System.out.println(rate);
		System.out.println(time);
        
		System.out.printf("\n%.1f",amount);
		System.out.printf("\n%.2f",rate);
		System.out.printf("\n%d",time);
		
		float interest=amount*rate*time;
		
		System.out.println("\nInterest is:"+interest);
	}

}
