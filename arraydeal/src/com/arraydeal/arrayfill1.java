package com.arraydeal;

public class arrayfill1
{
	int a[] = {32,34,54,65,67,78,45,23,44};
	void array_display()
	{
       System.out.print("\tDisplaying the current content...");
	   for(int i=0;i<9;i++)
	   {
		   System.out.print(a[i] + " ");
	   }
	   System.out.println("\n\tThe length of the array is :- " + a.length);
	}
	
	int array_max()
	{
		int i,max=0;
		for(i=0;i<9;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		return max;
	}
	
	int array_min()
	{
		int i,min=a[1];
		for(i=0;i<9;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}	
		}
		return min;
	}
	
	float array_average()
	{
		float avg=0;
		int i;
		for(i=0;i<a.length;i++)
		{
			avg=avg+a[i];
		}
		return (avg/9);
	}
	public static void main(String args[])
	{
		arrayfill1 a = new arrayfill1();
		a.array_display();
		System.out.println();
		System.out.println("\tMaximum number in the array is :- " + a.array_max());
		System.out.println("\tMinimum number in the array is :- " + a.array_min());
		System.out.println("\tAverage of the array is :- " + a.array_average());
	}
}