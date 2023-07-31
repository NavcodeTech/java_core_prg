package day5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetPrg1 {
	public static void main(String[] args) {
		//Set<String> citySet=new HashSet<>();
		//Set<String> citySet=new TreeSet<>();
		Set<String> citySet=new LinkedHashSet<>();
		Set<String> citySet2=new HashSet<>();
		citySet.add("New Delhi");
		citySet.add("Noida");
		citySet.add("New Delhi");
		citySet.add("Gurgaon");
		citySet.add("Agra");
		
		System.out.println(citySet);
		System.out.println(citySet.remove("Agra"));
		System.out.println(citySet.contains("Agra"));
		
		citySet2.add("Cheenai");
		citySet2.add("madurai");
		citySet2.add("Banglore");
		citySet2.add("Trivandrum");
		
		citySet.addAll(citySet2);
		Iterator<String> itr= citySet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Using for each loop");
		for(String s:citySet)
		{
			System.out.println(s+",");
		}
		
	}
}
