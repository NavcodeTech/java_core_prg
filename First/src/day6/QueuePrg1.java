package day6;

import java.util.*;

public class QueuePrg1 {
	public static void main(String[] args) {
		Queue<Integer> que=new LinkedList<>();
		
		for(int i=0;i<=100;i++)
		{
			que.add(i);
		}
		que.peek();
		que.element();//Retrieves and removes the head of this queue. 
		//This method differsfrom poll() only in that it throws an exception if this queue is empty.
		
		System.out.println(que);
		System.out.println(que.element());
		System.out.println(que.element());
		System.out.println(que);
		
		for(Integer val:que)
		{
			System.out.print(val+" ");
		}
		while(!que.isEmpty())
		{
			System.out.print(que.remove()+" ");
		}
		System.out.println();
		System.out.println(que);
		
		
	}
}
