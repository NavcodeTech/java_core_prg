package day5;

import java.util.Vector;

public class VectorPrg1 {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
	    System.out.println(v.size());
	    System.out.println(v.capacity());
	    for(int i=0;i<=9;i++)
	    {
	           v.add(i+100);
	    }
	    v.add(900);
	    System.out.println(v.size());
	    System.out.println(v.capacity());
	}

}
