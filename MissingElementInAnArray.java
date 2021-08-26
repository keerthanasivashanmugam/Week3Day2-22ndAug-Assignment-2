package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		
		int[] arr = {1,2,3,4,7,6,8};
		List <Integer> list1 = new ArrayList <Integer>();
		for (int i=0; i<arr.length;i++) {
			list1.add(arr[i]);
		}
		
		System.out.println("List values are : "+list1);
		Collections.sort(list1);
		System.out.println("List values are : "+list1);
		
		for(int i=list1.get(0);i<list1.size();i++)		
		{
		if (list1.get(i) != i+1)
			{
				System.out.println(i+1);
				break;
			}
				
		}
	
	}
	
	
}
