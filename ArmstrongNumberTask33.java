//	Write a program to check if a number is an Armstrong number.
package Java_Exercise;

import java.util.Scanner;

public class ArmstrongNumberTask33 {

	public static void main(String[] args) {
		int num,arm=0,temp,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			arm=(rem*rem*rem)+arm;
			num=num/10;
		}
			if(temp==arm)
			{
				System.out.println("armstrong number");
			}
			else
			{
				System.out.println("not armstrong number");
			}
			
		
		

	}

}
