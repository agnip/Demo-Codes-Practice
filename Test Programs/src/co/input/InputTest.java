package co.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest 
{
   int num1,num2,quo;
   
   void inputData()
   {
	   InputStreamReader isr = new InputStreamReader(System.in);
	   BufferedReader br = new BufferedReader(isr);
	   try
	   {
		   System.out.print("\nEnter no. 1 : ");
		   num1=Integer.parseInt(br.readLine());
		   System.out.print("\nEnter no. 2 : ");
		   num2=Integer.parseInt(br.readLine());
		   System.out.println("\nNo. 1 : " + num1 + " \nNo. 2 : " + num2);
	   } 
	   catch(IOException ioe)
	   {
		   System.out.println("IOException has Occurred.");
	   }
   }
   
   public static void main(String args[])
   {
	   InputTest it = new InputTest();
	   it.inputData();
   }
}
