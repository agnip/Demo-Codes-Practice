package myStuReg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyStudentUpdate 
{
	int i;
	ArrayList<MyStudentInfo> arraylist;
	   
	   public MyStudentUpdate()
	   {
		   int searchroll = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Student roll to be Updated...."));		  
		   boolean flag = false;
		   try
		   {
		       FileInputStream fin = new FileInputStream("Registration.dat");
		       ObjectInputStream oin = new ObjectInputStream(fin);
		       arraylist = (ArrayList<MyStudentInfo>)oin.readObject();
		   }
		   catch(Exception e)
		   {
			   arraylist = new ArrayList<MyStudentInfo>();
			   System.out.println("Creating the data file for the first time!!!!");   
		   }
		   
		   for(i=0;i<arraylist.size();i++)
		   {
			  MyStudentInfo ob1 = arraylist.get(i);
			  
			  if(searchroll == ob1.getRoll())
			  {
				  flag = true;
				  int m1 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks 1 : "));
				  int m2 =  Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Marks 2 : "));
				  ob1.setMarks1(m1);
				  ob1.setMarks2(m2);
			  }
		   }	
		   
		   if(flag == true)
		   {
		      try
		      {
		         FileOutputStream fout = new FileOutputStream("Registration.dat");
		         ObjectOutputStream oout = new ObjectOutputStream(fout);
		         oout.writeObject(arraylist);
		      }
		      catch(Exception e)
		      {
			     System.out.println("Exception Occurred.....");
		      }
		      System.out.println("Data Successufully Updated!!!");
	       }
		   else
		   {
			   JOptionPane.showMessageDialog(null,"Match not Found !!!!");
		   }
	   }
}
