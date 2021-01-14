package myPack;

public class Student 
{
   String name;
   int roll;
   public Student(String n,int r)
   {
	   name=n;
	   roll=r;
   }
   
   public void display()
   {
	   if(roll<0)
		   System.out.println("Invalid !!! Negative roll has been provided....");
	   else
		   System.out.println("Name : " + name + "-----Roll : " + roll);
   }
}
