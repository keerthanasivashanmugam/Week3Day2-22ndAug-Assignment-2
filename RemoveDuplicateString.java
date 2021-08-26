package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] text1 = text.split(" ");

		Set<String> stringSet = new LinkedHashSet<String>();
		System.out.print("Original String : ");
		for (int i = 0; i < text1.length; i++) {
			stringSet.add(text1[i]);
			System.out.print(text1[i]+" ");
		}

		System.out.println("\n\nAfter removing duplicate words : " +stringSet);
		System.out.print("\nAfter removing dulicate words : ");
		for (String string1 : stringSet) {
			System.out.print(string1+" ");
		}
	}

}
