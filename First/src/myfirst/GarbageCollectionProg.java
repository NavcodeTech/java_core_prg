package myfirst;

public class GarbageCollectionProg {
public static void main(String[] args) {
	java.util.Date date[]=new java.util.Date[100000];
	Runtime runtime=Runtime.getRuntime();
	System.out.println("Total Memory:"+runtime.totalMemory());
	System.out.println("Free Memory:"+runtime.freeMemory());
	
	for(int i=0;i<date.length;i++)
	{
		date[i]=new java.util.Date();
		
	}
	System.out.println("After date object:");
	System.out.println("Total Memory:"+runtime.totalMemory());
	System.out.println("Free Memory:"+runtime.freeMemory());
	System.out.println("Release memory");
	for (int i = 0; i < date.length; i++) {
		date[i]=null;
	}
	System.gc();
	System.out.println("After garbage collector called:");
	System.out.println("Total Memory:"+runtime.totalMemory());
	System.out.println("Free Memory:"+runtime.freeMemory());
	
}
}
