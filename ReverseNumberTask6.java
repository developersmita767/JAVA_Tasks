//	Write a program to reverse a number.
package Java_Exercise;

import java.util.Scanner;

public class ReverseNumberTask6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is:"+ rev);

	}

}
