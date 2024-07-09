//Write a program to print the Fibonacci series up to a given number.
package Java_Exercise;

public class FibonacciSeriesTask3 {

	public static void main(String[] args) {
		int n1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<10;i++)//i=2 bcz already print 0 and 1
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			
		}
		
	}

}
