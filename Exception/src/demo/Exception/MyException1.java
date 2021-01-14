package demo.Exception;

public class MyException1 
{
   int num1,num2,quotient;
   
   public void myCalculation1()
   {
	   num1=100;
	   num2=10;
	   quotient=(num1/num2);
	   System.out.println("The Quotient of " + num1 + " and " + num2 + " is " + (num1/num2));
   }
   
   static public void myWelcome()
   {
	   System.out.println("Welcome to Java 8.....");
   }
   
   static public void main(String args[])
   {
	   MyException1 me = new MyException1();
	   me.myWelcome();
	   myWelcome();
	   MyException1.myWelcome();
	   me.myCalculation1();
   }
}
