package day3;

public class BusMain {

	public static void main(String[] args) {
		
		Bus bus1=new Bus(22331,"delhi-Noida", 80);
		Bus bus2=new Bus(22331,"delhi-Noida", 80);
		System.out.println(bus1.toString());
		System.out.println("bus1 hashcode="+bus1.hashCode());
		System.out.println("bus2 hashcode="+bus2.hashCode());
		if(bus1.equals(bus2))
		    System.out.println("equals");
		else
			System.out.println("Not equals");
	}

}
