//	Write a program to check if a number is prime.
package Java_Exercise;

import java.util.Scanner;

public class PrimeNumberTask4 {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("number is prime");
			
		}
		else
		{
			System.out.println("number is not prime");
		}

	}

}
