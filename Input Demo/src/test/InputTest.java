package test;

import java.io.*;

public class InputTest extends Exception
{
    int test;
	float num1,num2,b[];
   
   void Test(int t)
   {
	   test=t;
   }
   
   public String toString()
   {
	   return ("As you can probably guess......"
	   		 + "The Exception has been caught!!! ");
   }
   
   float retSum()
   {
	   return (num1+num2);
   }
   
   void input()throws InputTest,IOException
   {
	   if(test==0)
		   throw new InputTest();
	   try
	   {
	       InputStreamReader isr = new InputStreamReader(System.in);
	       BufferedReader br = new BufferedReader(isr);
	       System.out.print("\nEnter No. 1 :- " );
	       num1 = Float.parseFloat(br.readLine());
	       System.out.print("\nEnter No. 2 :- " );
	       num2 = Float.parseFloat(br.readLine());
	       b = new float[(int) num1];
	       System.out.println("Content of the 11th location of the array " + b[10]);
	   }
	   catch(NumberFormatException nfe)
	   {
		   System.out.println("Exception : " + nfe);
	   }
	   catch(NegativeArraySizeException nase)
	   {
		   System.out.println("Exception : " + nase);
	   }
	   catch(ArrayIndexOutOfBoundsException aioobe)
	   {
		   System.out.println("Exception : " + aioobe);
	   }
	   catch(ArrayStoreException ase)
	   {
		   System.out.println("Exception : " + ase);
	   }
   }
   
   public static void main(String args[])
   {
      InputTest IT = new InputTest();
      IT.Test(1);
      try
      {
    	  IT.input();
    	  System.out.print("\nSum : " + IT.retSum());
      }
      catch(IOException ioe)
      {
    	  System.out.println("Exception : " + ioe);
      }
      catch(InputTest it)
      {
    	  System.out.println("Exception : " + it);
      }
      System.out.print("\nEnd of Program....");
   }
}
