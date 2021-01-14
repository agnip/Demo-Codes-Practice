package com.arraydeal;

public class Magic_square 
{
   int n,r,c,i,magic_sum;
   int a[][] = new int [20][20];
   
   void array_display()
   {
	   int i,j;
	   n=5;
	   System.out.println("The Magic Square is : ");
	   for(i=0;i<n;i++)
	   {
		  System.out.println("");
		  for(j=0;j<n;j++)
		  {
			  System.out.print(a[i][j] + "   ");
		  }
	   }
   }
   
   void array_magic_square()
   {
	   n=5;
	   r=0;
	   c=n/2;
	   for(i=1;i<=(n*n);i++)
	   {
		  a[r][c]=i;
		  r--;
		  c++;
		  if(r==-1 && c==n)
		  {
			  r=r+2;
			  c--;
		  }
		  else if(r==-1)
              r=n-1;
		  else if(c==n)
			  c=0;
		  else if(a[r][c]!=0)
		  {
			  r=r+2;
			  c--;
		  }  
	   }
   }
   
   public static void main(String args[])
   {
	   Magic_square MS = new Magic_square();
	   MS.array_magic_square();
	   MS.array_display();
   }
}
