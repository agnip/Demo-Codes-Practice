package myStuReg;

import java.io.*;
import java.util.*;
import javax.swing.*;

public class MyStudentDelete 
{
	@SuppressWarnings("unchecked")
	public MyStudentDelete()
	{
		int i;
		boolean flag = false;
		ArrayList<MyStudentInfo> arraylist = new ArrayList<MyStudentInfo>();
		PrintWriter pw = new PrintWriter(System.out,true);     	

		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Registration.txt")))
		{
			arraylist = (ArrayList<MyStudentInfo>)oin.readObject();

			if(arraylist.size() > 0)
			{

			}
			else
			{
				JOptionPane.showMessageDialog(null,"No Records Present !!! Please Register at least one record....");
				return;
			}

			int searchroll;
			try
			{
				searchroll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll  No. to be deleted : "));
			}
			catch(Exception e)
			{
				return;
			}

			JOptionPane.showMessageDialog(null,"Searching Records....");
			for(i=0;i<arraylist.size();i++)
			{
				MyStudentInfo MSI = arraylist.get(i);

				if(searchroll == MSI.getRoll())
				{
					flag = true;
					JOptionPane.showMessageDialog(null,"Match Found !!!!");
					String str = new String();
					str = "Details of the record to be deleted are.....";
					str +="\nRoll : " + MSI.getRoll();
					str +="\nName : " + MSI.getName();
					str += "\nSubject Marks are.......";
					str += "\nMarks-1 : " + MSI.getMarks1() + "\nMarks-2 : " + MSI.getMarks2();
					JOptionPane.showMessageDialog(null,str);
					JOptionPane.showMessageDialog(null,"Deleting Record now......... ");
					arraylist.remove(i);
				}
			}

			if(!flag)
			{
				JOptionPane.showMessageDialog(null,"Match not Found.....");
			}
			else
			{
				try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("Registration.txt")))
				{
					oout.writeObject(arraylist);
				}
				catch(Exception e)
				{
					pw.println("Interrupted !!! I/O Error has Occurred.....");
				}
			}
		}
		catch(Exception e)
		{
			if(MyStudentInfo.test==false)
			{
				MyStudentInfo.test = true;
				pw.println("Data File Created for the First Time....");
				arraylist = new ArrayList<MyStudentInfo>();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"No Records Present !!! Please Register at least one record....");
			}
		}
	}
}
