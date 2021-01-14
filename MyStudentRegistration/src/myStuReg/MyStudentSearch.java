package myStuReg;

import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyStudentSearch
{
   int searchroll,i;
   Boolean Flag = false;
   ArrayList<MyStudentInfo> arraylist = new ArrayList<MyStudentInfo>();
   
   public MyStudentSearch()
   {
	   searchroll = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Roll to be Searched : "));
	   
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
			   JOptionPane.showMessageDialog(null,"Match Found !!!");
			   Flag = true;
			   String str = new String();
			   str = "The Details are......";
			   str += "\nRoll : " + ob1.getRoll();
			   str += "\nName : " + ob1.getName();
			   str += "\nSubject Marks.......";
			   str += "\nSubject 1 : " + ob1.getMarks1();
			   str += " Subject 2 : " + ob1.getMarks2();
		   }	   
	   }
	   
	   if(!Flag == true)
	   {
		   JOptionPane.showMessageDialog(null,"Match not Found !!!!");
	   }
   }
}
