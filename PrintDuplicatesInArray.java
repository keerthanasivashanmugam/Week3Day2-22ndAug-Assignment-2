package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		System.out.print("Array values : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
			if (!set1.add(arr[i]))
				set2.add(arr[i]);
		}

		System.out.println("\nUnique values in Array : " + set1);
		System.out.println("Duplicate values in Array : " + set2);
	}

}
