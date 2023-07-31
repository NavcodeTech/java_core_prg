package day3;

//if we make class as final we can't inherit it
public class Formula {
	//If we make it final can't override it
	float speed(float distance,float time)
	{
		return distance/time;
	}
	void info()
	{
		System.out.println("formula class");
	}
}
class MyFormula extends Formula
{
	@Override
	float speed(float distance, float time) {
		
		return distance/2*time;
	}
}
