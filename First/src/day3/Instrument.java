package day3;

public abstract class Instrument {
	abstract void play();
	
}
class Piano extends Instrument
{

	@Override
	void play() {
		System.out.println("Piano is playing tan tan tan");
	}
}
class Flute extends Instrument
{
	@Override
	void play() {
		System.out.println("Flute is playing toot toot toot..");
		
	}
}
class Guitar extends Instrument
{
	@Override
	void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}

class InstrumentMain
{
	public static void main(String[] args) {
		Instrument rf[]=new Instrument[10];
		for(int i=0;i<rf.length;i++)
		{
			rf[i]=new Flute();
			rf[i].play();
			
			rf[i]=new Piano();
			rf[i].play();
			
			rf[i]=new Guitar();
			rf[i].play();
		}
	}
}
