package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {

		//String[] str1 = {"Google","Microsoft","TestLeaf","Maverick" };
		
		String[] str1 = {"Wipro", "HCL" , "CTS", "Aspire Systems"};
		List <String> strList = new ArrayList<String>  (Arrays.asList(str1));
		System.out.println("Original List : "+strList);
		System.out.println("Size of the List :"+strList.size());
		Collections.sort(strList);
		System.out.println("Sorted List : "+strList);
		System.out.print("List in Reverse Order : ");
		for ( int i=strList.size()-1;i>=0;i--)
		{
			System.out.print(strList.get(i)+", ");
		}
		
			
	}
}
