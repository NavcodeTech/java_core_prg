package day5;

import java.util.ArrayList;
import java.util.Collection;

public class ListPrg1 {
	public static void main(String[] args) {
		Collection cl=new ArrayList();
		cl.add(1234);
		cl.add(new Integer("1234"));
		cl.add(45000.0f);
		cl.add("Greater Noida");
		System.out.println(cl);
		
		System.out.println(cl.contains(1234));
		System.out.println(cl.isEmpty());
		System.out.println(cl.remove(45000.0f));
		System.out.println(cl);
		cl.clear();
		System.out.println(cl);
	}
}
