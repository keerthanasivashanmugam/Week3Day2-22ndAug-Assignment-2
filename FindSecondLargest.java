package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		int secLargestValue;
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i=0;i<data.length;i++) {
		list1.add(data[i]);
				}
		System.out.println("List values before sort : "+list1);
		Collections.sort(list1);
		System.out.println("List values after sorting : "+list1);
		System.out.print("Second largest value is : ");
		secLargestValue=list1.size();
				System.out.println(list1.get(secLargestValue-2));
		
	}

}
