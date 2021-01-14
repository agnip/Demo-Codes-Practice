package scannerclass;

import java.util.Scanner;

public class myClassOne 
{
   int n1,n2,result;
   Scanner sc = new Scanner(System.in);
   
   public myClassOne()
   {
	   
   }
   
   public myClassOne(int n1,int n2)
   {
      System.out.print("\nInitialising two numbers.....");
      this.n1 = n1;
      this.n2 = n2;
   }
   
   public void myInput()

   {
	   System.out.print("\nAccepting data from input device.......");
	   System.out.print("\nEnter the first number : ");
	   n1 = sc.nextInt();
	   System.out.print("\nEnter the second number : ");
	   n2 = sc.nextInt();
   }

   public void myCalculation()
   {
	   System.out.print("\nPerforming Addition.....");
	   result = n1+n2;
	   display();
   }
   
   public void display()
   {
	   System.out.print("\nResult : " + result);
   }
   
}
