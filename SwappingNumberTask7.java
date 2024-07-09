//	Write a program to swap two numbers without using a third variable.
package Java_Exercise;

import java.util.Scanner;

public class SwappingNumberTask7 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After  swapping: "+a+" "+b);

	}

}
