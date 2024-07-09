//	Write a program to find the square root(whole number part) of a number without using inbuilt function.
package Java_Exercise;

import java.util.Scanner;

public class SquareRootNumberTask50 {

	public static void main(String[] args) {
		/*double sr=Math.sqrt(25);
		System.out.println(" squareroot of a number: "+ sr);*/
		
	int num=64;
	double temp;
	double sr=num/2;
	do {
		temp=sr;
		sr=(temp+(num/temp))/2;
			
		}while((temp-sr)!=0);
		{
			System.out.println(" squareroot of a number: "+ sr);
		}
		
	
	}

}
