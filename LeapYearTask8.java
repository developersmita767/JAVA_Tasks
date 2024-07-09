//Write a program to check if a year is a leap year.
package Java_Exercise;

import java.util.Scanner;

public class LeapYearTask8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER ANY YEAR");
		int y=sc.nextInt();
		if(y%100==0 && y%400==0 || y%100!=0 && y%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println(" not Leap year");
		}

	}

}
