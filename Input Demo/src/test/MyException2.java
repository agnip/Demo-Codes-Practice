package test;

public class MyException2 
{
   void fun1(int n)
   {
	   try
	   {
		   System.out.println("Current value of n : " + n);
		   if(n<10)
		   {
			   System.out.println("The Value of n is lesser than 10.");
			   throw new ArithmeticException();
		   }
	   }
	   finally
	   {
		   System.out.println("I am the finally block and "
	              + "\nno one in this whole world can't stop"
			   	  + "\nme from getting executed..."
			   	  + "\n...I am unstoppable...");
	   }
   }
   
   void fun2()
   {
	   try
	   {
		   System.out.println("In fun2() block..........");
		   System.exit(0);
	   }
	   finally
	   {
		   System.out.println("From fun2() Finally says -->Stop me if "
		   		+ "you can.......");
	   }
   }
   
   public static void main(String args[])
   {
	   MyException2 me = new MyException2();
	   me.fun2();
	   try
	   {
	      me.fun1(28);
	   }
	   catch(ArithmeticException ae)
	   {
		   System.out.println("Arithmetic Exception has occured.");
		   System.out.println("Description : " + ae);
	   }
   }   
}
   
