//1.	Write a program to check if a number is even or odd.
package Java_Exercise;

import java.util.Scanner;

public class CheckEvenOddTask1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
		

	}

}
