//	Write a program to sort an array of integers.
package Java_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayTask9 {

	public static void main(String[] args) {
		/*int[] arr=new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any element in array");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					
					arr[j]=temp;
				}
				
			}
			
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+" ");
		}*/
		int[] arr={20,32,16,31,9,18,54};
		Arrays.sort(arr);
		System.out.println("enter the element in ascending order");
		Arrays.stream(arr).forEach(a->System.out.print(" "+a));
		

	}

}
