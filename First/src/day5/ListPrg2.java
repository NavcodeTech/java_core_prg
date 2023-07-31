package day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPrg2 {
	public static void main(String[] args) {
		List<String> cl=new ArrayList<>();
		cl.add("hello");
		cl.add("welcome");
		cl.add("Good morning");
		cl.add("greetings");
		
		System.out.println(cl);
		System.out.println(cl.get(0));
		System.out.println(cl.get(1));
		
		System.out.println("using for loop");
		
		for(int i=0;i<cl.size();i++)
			System.out.println(cl.get(i)+", ");
		
		System.out.println("using for-each loop");
		
		for(String s:cl)
			System.out.println(s+",");
		
		Iterator<String> itr=cl.iterator();
		
		while(itr.hasNext())
		{
			String next=itr.next();
			if(next.equals("greetings"))
			{
				itr.remove();
			}
			System.out.println(next);
		}
		System.out.println(cl);
	}
}
