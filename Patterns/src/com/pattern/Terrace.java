package com.pattern;
public class Terrace 
{
    int i,j,k; 
	void print_terrace(int n)
    {
	   for(i=1;i<=n;i++)
	   {
		   if(i<=(n+1)/2)
		   {
			   for(j=1;j<=n-i;j++)
		       {
			      System.out.print("  ");
		       }
		       for(j=1;j<=2*i-1;j++)
		       {   
			      System.out.print("* ");   
		       }
		       System.out.println("");
	       }
		   else
		   {
			   for(j=1;j<=i-6;i++)
			   {
				   System.out.print(" ");
			   }
			   for(j=2*(n-i)+1;j>=1;j--)
			   {
				   System.out.print("* ");
			   }
			   System.out.println("");
		   }
	   }
	
    }
	public static void main(String args[])
	{
		Terrace T = new Terrace();
		T.print_terrace(7);
	}
}