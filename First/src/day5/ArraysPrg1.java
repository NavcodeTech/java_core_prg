package day5;

import java.util.Arrays;

public class ArraysPrg1 {
	public static void main(String[] args) {
		int arr[]= {11,23,45,65,44,43};
		int arr2[]= {11,23,45,65,44,43};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2.equals(arr));
		Arrays.sort(arr);
		System.out.println(arr2.equals(arr));
		System.out.println(Arrays.toString(arr));
		int bs= Arrays.binarySearch(arr, 44);
		if(bs>=0)
		{
			System.out.println("found at "+bs);
		}
		else
			System.out.println("Not found");
	}
}
