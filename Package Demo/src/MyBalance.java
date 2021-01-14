import myPack.*;

public class MyBalance 
{
   public static void main(String args[])
   {
	   int i;
	   System.out.println("Dealing with Balance1 class object....");
	   Balance1 test = new Balance1("Arno Dorian",888.95);
	   test.show();
	   Balance1 current[] = new Balance1[3];
	   current[0]=new Balance1("Mr. Dhar",123.52);
	   current[1]=new Balance1("Mr. Kar",157.02);
	   current[2]=new Balance1("Mr. Dhar",12.23);
	   for(i=0;i<3;i++)
		   current[i].show();
	   System.out.println("\nDealing with Student class object....");
	   Student boys[] = new Student[5];
	   boys[0]=new Student("Amal",1);
	   boys[1]=new Student("Bimal",2);
	   boys[2]=new Student("Kamal",3);
	   boys[3]=new Student("Chanchal",4);
	   boys[4]=new Student("Shyamal",5);
	   for(i=0;i<5;i++)
		   boys[i].display();
   }
}
