package myStuReg;

import java.io.*;
import java.util.ArrayList;

public class MyStudentAdd 
{
   ArrayList<MyStudentInfo> arrlist;
   
   public MyStudentAdd(MyStudentInfo MSI)
   {
	   
	   /*Reading from File*/
	   
	   try
	   {
	       FileInputStream fin = new FileInputStream("Registration.dat");
	       ObjectInputStream oin = new ObjectInputStream(fin);
	       arrlist = (ArrayList<MyStudentInfo>)oin.readObject();
	   }
	   catch(Exception e)
	   {
		   arrlist = new ArrayList<MyStudentInfo>();
		   System.out.println("Creating the data file for the first time!!!!");   
	   }
	   
	   arrlist.add(MSI); //Adding To File
	   
	   /*Writing to File*/
	   
	   try
	   {
	       FileOutputStream fout = new FileOutputStream("Registration.dat");
	       ObjectOutputStream oout = new ObjectOutputStream(fout);
	       oout.writeObject(arrlist);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception Occurred.....");
	   }
	   System.out.println("Data Successufully Written!!!");
   }
}
