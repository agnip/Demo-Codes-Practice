package myStuReg;

import java.io.Serializable;

public class MyStudentInfo implements Serializable
{
   int roll,marks1,marks2;
   String name;
   
   public MyStudentInfo()
   {
	   
   }
   
   public MyStudentInfo(int r,String n,int m1,int m2)
   {
	   roll = r;
	   name = n;
	   marks1 = m1;
	   marks2 = m2;
   }
   
   public int getRoll()
   {
	   return roll;
   }
   
   public String getName()
   {
	   return name;
   }
   
   public int getMarks1()
   {
	   return marks1;
   }
   
   public int getMarks2()
   {
	   return marks2;
   }
   
   public void setRoll(int r)
   {
	   roll=r;
   }
   
   public void setName(String n)
   {
	   name = n;
   }
   
   public void setMarks1(int m1)
   {
	   marks1 = m1;
   }
   
   public void setMarks2(int m2)
   {
	   marks2 = m2;
   }
}
