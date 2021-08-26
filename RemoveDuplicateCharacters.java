package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		String str1 =  "PayPal India";
		 str1 = str1.toLowerCase();
		str1 = str1.replace(" ","");
		char[] charArr = str1.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupcharSet = new LinkedHashSet<Character>();
		System.out.print("Original String : ");
		for (int i=0;i<charArr.length;i++) 
		{
			if(!charSet.add(charArr[i]))
			dupcharSet.add(charArr[i]);
			System.out.print(charArr[i]);			
		}
		
		System.out.println("\nCharacter Set : "+charSet);
		System.out.println("Duplicate Set : "+dupcharSet);
		
		
		
	}
	
}
