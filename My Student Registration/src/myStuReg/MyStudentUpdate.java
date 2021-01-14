package myStuReg;

import java.io.*;
import java.util.*;

import javax.swing.*;

public class MyStudentUpdate 
{
	@SuppressWarnings("unchecked")
	public MyStudentUpdate()
	{
		int i,m1,m2,check=0;
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
				searchroll = Integer.parseInt(JOptionPane.showInputDialog("Enter Roll  No. to be Updated : "));
			}
			catch(Exception e)
			{
				return;
			}

			JOptionPane.showMessageDialog(null,"Searching for Records to be updated.....");
			for(i=0;i<arraylist.size();i++)
			{
				MyStudentInfo MSI = arraylist.get(i);

				if(searchroll == MSI.getRoll())
				{
					flag = true;
					JOptionPane.showMessageDialog(null,"Match Found.....");
					String str = new String();
					str = "Details are.....";
					str +="\nRoll : " + MSI.getRoll();
					str +="\nName : " + MSI.getName();
					str += "\nSubject Marks are.......";
					str += "\nMarks-1 : " + MSI.getMarks1() + "\nMarks-2 : " + MSI.getMarks2();
					JOptionPane.showMessageDialog(null,str);
					JOptionPane.showMessageDialog(null,"Update Marks Now.....");
					try
					{
						m1 = Integer.parseInt(JOptionPane.showInputDialog("Enter Marks-1 : "));
					}
					catch(Exception e)
					{
						m1 = MSI.getMarks1();
						check++;
					}

					try
					{
						m2 = Integer.parseInt(JOptionPane.showInputDialog("Enter Marks-2 : "));
					}
					catch(Exception e)
					{
						m2 = MSI.getMarks2();
						check--;
					}

					MSI.setMarks1(m1);
					MSI.setMarks2(m2);
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

				if(check != 0)
					JOptionPane.showMessageDialog(null,"Data Succesfully Updated.....");
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
				JOptionPane.showMessageDialog(null,"No Records Present !!! Please Register at least one record....(Exception)");
			}
		}
	}
}