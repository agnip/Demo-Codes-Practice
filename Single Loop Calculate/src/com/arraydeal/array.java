package com.arraydeal;

public class array 
{
    int a[]={52,69,78,25,64,78,25,25,28,27};
    float array_special_average()
    {
    	int max,max_freq,min,min_freq,sum,i;
    	max=min=sum=a[0];
    	max_freq=min_freq=1;
    	for(i=1;i<a.length;i++)
    	{
    		if(max<a[i])
    		{
    			max=a[i];
    		}
    		else if(min>a[i])
    		{
    			min=a[i];
    		}
    		else if(max==a[i])
    		{
    			max_freq++;
    		}
    		else if(min==a[i])
    		{
    			min_freq++;
    		}
    		sum=sum+a[i];
    	}
    	return ((sum - (max_freq*max) -(min_freq*min))/(a.length-max_freq-min_freq));
    }
    public static void main(String args[])
    {
    	array A = new array();
    	System.out.println("The Special Average is : " + A.array_special_average());
    }
}
