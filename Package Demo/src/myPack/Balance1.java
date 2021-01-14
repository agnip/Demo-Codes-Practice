package myPack;

public class Balance1 
{
   String name;
   double bal;
   public Balance1(String n,Double b)
   {
	  name=n;
	  bal=b;
   }
   
   public void show()
   {
	   System.out.println("Name : " + name + "------Balance : " + bal);
   }
}
