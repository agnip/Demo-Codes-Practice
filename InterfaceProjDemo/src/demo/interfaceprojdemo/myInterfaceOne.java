package demo.interfaceprojdemo;

public interface myInterfaceOne 
{
   void myFunction11();
   void myFunction12();
   
   default String myFunction13()
   {
	   return ("I am returning from myFunction13().");
   }
   
   static int myFunction14()
   {
	   return 100;
   }
}
