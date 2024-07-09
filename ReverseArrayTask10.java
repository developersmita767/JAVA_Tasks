//Write a program to reverse an array.
package Java_Exercise;

import java.util.Scanner;

public class ReverseArrayTask10 {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter an element in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Reversed array elements  ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
		
		

	}

}
