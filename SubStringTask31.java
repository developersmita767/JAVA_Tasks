//Write a program to print all substrings of a given string.
package Java_Exercise;

public class SubStringTask31 {

	public static void main(String[] args) {
		String str="hello";
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
			}
		}
	}

}
