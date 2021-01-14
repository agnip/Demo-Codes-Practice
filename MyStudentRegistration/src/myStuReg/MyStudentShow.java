package myStuReg;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class MyStudentShow extends JFrame
{
   public MyStudentShow()
   {
	   super("Display All the Student Records");
	   int i;
	   String tableHeading [ ] = {"Roll","Name","Marks-1","Marks-2"};
	   String tabBody[][];
	   
	   ArrayList<MyStudentInfo> arraylist = new ArrayList<MyStudentInfo>();
	   try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Registration.dat")))
	   {
		   arraylist = (ArrayList<MyStudentInfo>) oin.readObject();
		   
		   tabBody = new String[arraylist.size()][4];
		   
		   for(i=0;i<arraylist.size();i++)
		   {
			   MyStudentInfo ob1 = arraylist.get(i);
			   
			   tabBody[i][0] = ob1.getRoll() + "";
			   tabBody[i][1] = ob1.getName() + "";
			   tabBody[i][2] = ob1.getMarks1() + "";
			   tabBody[i][3] = ob1.getMarks2() + "";
		   }
		   
		   Container  c = getContentPane();		  
		   c.setLayout(new BorderLayout());
		   JTable dataTable = new JTable(tabBody,tableHeading);
		   JScrollPane jsp = new JScrollPane(dataTable);
		   c.add(new JLabel("All Students Records..."),BorderLayout.NORTH);
		   c.add(jsp,BorderLayout.CENTER);
		   setSize(500,500);
	       setLocation(400,400);
	       setVisible(true);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Exception has Occured.");
	   }
   }
}
