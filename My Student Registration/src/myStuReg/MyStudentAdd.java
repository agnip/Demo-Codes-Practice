package myStuReg;

import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;

//This Class is responsible for adding a Student Record to a file....
//... when the Register command button is clicked

public class MyStudentAdd 
{	
	ArrayList<MyStudentInfo> arraylist;

	@SuppressWarnings("unchecked")
	//Parameterised Constructor with MyStudentInfo object as argument

	public MyStudentAdd(MyStudentInfo MSI)
	{
		int i;
		PrintWriter pw = new PrintWriter(System.out,true); 

		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Registration.txt")))
		{
			arraylist = (ArrayList<MyStudentInfo>)oin.readObject();
		}
		catch(Exception e)
		{
			if(MyStudentInfo.test==false)
			{
				MyStudentInfo.test = true;
				pw.println("Data File Created for the First Time....");
				arraylist = new ArrayList<MyStudentInfo>();
			}
		}

		for(i=0;i<arraylist.size();i++)
		{
			MyStudentInfo ob1 = arraylist.get(i);
			if(MSI.getRoll() == ob1.getRoll())
			{
				JOptionPane.showMessageDialog(null,"Duplicate Roll No. !!!!! \nRoll no. of every Student must be unique !!!!");
				return;
			}
		}

		arraylist.add(MSI);

		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("Registration.txt")))
		{
			oout.writeObject(arraylist);
			pw.println("Data Successfully Written onto file....");
		}
		catch(Exception e)
		{
			pw.println("Interrupted !!! I/O Error has Occurred.....");
		}
	}
}