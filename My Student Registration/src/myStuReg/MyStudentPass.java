package myStuReg;

import java.io.*;
import java.awt.*;
import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class MyStudentPass extends JFrame
{
	@SuppressWarnings("unchecked")
	public MyStudentPass()
	{
		super("Displaying all Student Records.....");
		int i,location = -1;
		JLabel JL1;
		String tableheading[ ] = {"Roll","Name","Marks-1","Marks-2"},tabbody[ ][ ];
		ArrayList<MyStudentInfo> arraylist = new ArrayList<MyStudentInfo>();
		PrintWriter pw = new PrintWriter(System.out,true);     	

		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream("Registration.txt")))
		{
			arraylist = (ArrayList<MyStudentInfo>)oin.readObject();
			tabbody = new String[arraylist.size()][4];

			if(arraylist.size() > 0)
			{
				JOptionPane.showMessageDialog(null,"Showing passed students Records");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"No Records Present !!! Please Register at least one record....");
				return;
			}

			for(i=0;i<arraylist.size();i++)
			{
				MyStudentInfo MSI = arraylist.get(i);

				if((MSI.getMarks1() + MSI.getMarks2())/2 >= 50)
				{
					location++;
					tabbody[location][0] = "                   " + MSI.getRoll() + "";
					tabbody[location][1] = MSI.getName() + "";
					tabbody[location][2] = "                  " + MSI.getMarks1() + "";
					tabbody[location][3] = "                  " + MSI.getMarks2() + "";
				}
			}

			Container c;
			c = getContentPane();
			c.setLayout(new BorderLayout());
			JTable datatable = new JTable(tabbody,tableheading);
			JScrollPane jsp =  new JScrollPane(datatable);
			Font F1 = new Font("Algerian",Font.LAYOUT_NO_LIMIT_CONTEXT,22);
			JL1 = new JLabel("                    PASSED STUDENT RECORDS");
			c.add(JL1);
			JL1.setFont(F1);
			JL1.setForeground(Color.RED);
			c.add(jsp,BorderLayout.EAST);
			c.add(jsp,BorderLayout.SOUTH);

			setSize(500,500);
			setLocation(600,200);
			setVisible(true);
			setResizable(false);
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
