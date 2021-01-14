package myStuReg;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyStudentDelete 
{
   int searchroll,i;
   Boolean Flag = false;
   ArrayList<MyStudentInfo> arraylist = new ArrayList<MyStudentInfo>();
   
   public MyStudentDelete()
   {
	   searchroll = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Roll to be Deleted : "));
	   
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
		   
		   if(ob1.getRoll() == searchroll)
		   {
			   JOptionPane.showMessageDialog(null,"Match Found !!! Deleting Record Now....");
			   Flag = true;
			   arraylist.remove(i);
		   }	   
	   }
	   
	   if(Flag == true)
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
	   }
	   else 
	   {
		   JOptionPane.showMessageDialog(null,"Match not Found !!!!");
	   }
   }
}
