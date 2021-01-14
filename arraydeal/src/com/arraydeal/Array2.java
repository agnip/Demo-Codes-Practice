package com.arraydeal;

public class Array2 
{
   int a[][] = new int[4][4];
   
   void array_initialise()
   {
	   int i;
	   for(i=0;i<4;i++)
	   {
	    	  a[i][i]=10;
	          a[i][3-i]=20;
	   }
   }
   
   void array_display()
   {
	   int i,j;
	   for(i=0;i<4;i++)
	   {
		   System.out.println("\t");
		   for(j=0;j<4;j++)
			   System.out.print(" " + a[i][j]);
	   }
   }
   
   public static void main(String args[])
   {
	   Array2 A2 = new Array2();
	   A2.array_initialise();
	   A2.array_display();
	   
	   System.out.println("\nEnd of the Program.");
   }
}
