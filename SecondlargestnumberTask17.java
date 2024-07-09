package Java_Exercise;

public class SecondlargestnumberTask17 {

	public static void main(String[] args) {
	int a[]= {2,7,9,12,15,20,3};
	int max1,max2;
	max1=max2=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max1)
		{
			max2=max1;
			max1=a[i];
		}
		else if(a[i]>max2)
		{
			max2=a[i];
		}
	}
	System.out.println("second largest number:"+max2);

	}

}
