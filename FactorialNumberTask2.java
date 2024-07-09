//	Write a program to find the factorial of a given number.
package Java_Exercise;

import java.util.Scanner;

public class FactorialNumberTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*  int num=5;
         int fact = 1;
         for(int i=1;i<=num;i++)
         {
        	 fact=fact*i;
         }
         System.out.println("factorial of this number is:" + fact);*/
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		  System.out.println("factorial of this number is:" + fact);
	}

}
