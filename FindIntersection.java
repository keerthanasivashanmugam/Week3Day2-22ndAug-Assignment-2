package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		int[] intArray1 = { 3, 2, 11, 4, 6, 7 };
		int[] intArray2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list1 = new ArrayList<Integer>(); // (Arrays.asList()) not able to pass this as arguments  
		List<Integer> list2 = new ArrayList<Integer>();
		
		for (int i = 0; i < intArray1.length; i++) { 
			list1.add(intArray1[i]);
			list2.add(intArray2[i]);
		} 
					
		System.out.println("List 1 values : " + list1);
		System.out.println("List 2 values : " + list2);
		System.out.print("Intersect values of list : ");
		list1.retainAll(list2);
		System.out.println(list1);
		
	}
}
