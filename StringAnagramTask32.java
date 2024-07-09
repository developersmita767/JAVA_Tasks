//	Write a program to check if two strings are anagrams.
package Java_Exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagramTask32 {

	public static void main(String[] args) {
		String a="LISTEN";
		String b="SILENT";
		
		char x[]=a.toCharArray();
		char y[]=b.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		boolean result=Arrays.equals(x, y);
		if(result==true)
		{
			System.out.println("string are anargram");
			
		}
		else
		{
			System.out.println("string are not anargram");
		}

	}

}
