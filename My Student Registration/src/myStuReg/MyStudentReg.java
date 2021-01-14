//This Java Program Manages the entire Registration process of the students
package myStuReg;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Container;

@SuppressWarnings("serial")
//This Class is Responsible for the GUI(Graphical User Interface of the project)
public class MyStudentReg extends JFrame implements ActionListener
{

	JLabel lblheading,lblheading1,lblroll,lblname,lblmarks1,lblmarks2;
	JTextField tfroll,tfname,tfmarks1,tfmarks2;
	JButton btnregister,btnreset,btnshow,btnupdate,btndelete,btnquit,btnsearch,btnpass;
	Container c;

	//Default Constructor
	//Sets up the GUI Interface of the Project
	public MyStudentReg()
	{
		super("    STUDENT REGISTRATION    ");

		//Setting up the Initial Window
		c = getContentPane();
		c.setLayout(new GridLayout(9,2));

		//Setting up the Label Boxes with appropriate fonts and colours
		Font f1 = new Font("Lucida Fax",Font.BOLD + Font.ITALIC,16);
		Font f2 = new Font("Lucida Sans",Font.BOLD + Font.HANGING_BASELINE,14);
		lblheading = new JLabel("                       STUDENT REGIS");
		lblheading.setFont(f1);
		lblheading.setForeground(Color.red);
		lblheading1 = new JLabel("TRATION FORM");
		lblheading1.setFont(f1);
		lblheading1.setForeground(Color.lightGray);
		lblroll = new JLabel("    Enter Roll :  ");
		lblroll.setFont(f2);
		lblroll.setForeground(Color.DARK_GRAY);
		lblname = new JLabel("    Enter Name : ");
		lblname.setFont(f2);
		lblname.setForeground(Color.DARK_GRAY);
		lblmarks1 = new JLabel("    Enter Marks 1 : ");
		lblmarks1.setFont(f2);
		lblmarks1.setForeground(Color.DARK_GRAY);
		lblmarks2 = new JLabel("    Enter Marks 2 : ");
		lblmarks2.setFont(f2);
		lblmarks2.setForeground(Color.DARK_GRAY);

		//Setting the width of the text fields
		tfroll = new JTextField(20);
		tfname = new JTextField(20);
		tfmarks1 = new JTextField(20);
		tfmarks2 = new JTextField(20);

		//Naming the Command Buttons
		btnreset = new JButton("Reset");
		btnregister = new JButton("Register");
		btnshow = new JButton("Show All Students");
		btnpass = new JButton("Students Passed");
		btnupdate = new JButton("Update Marks");
		btndelete = new JButton("Delete");
		btnsearch = new JButton("Search");
		btnquit = new JButton("Quit");

		//Ensuring that they perform their specified actions when clicked
		btnregister.addActionListener(this);
		btnshow.addActionListener(this);
		btnsearch.addActionListener(this);
		btnpass.addActionListener(this);
		btnupdate.addActionListener(this);
		btndelete.addActionListener(this);
		btnreset.addActionListener(this);
		btnquit.addActionListener(this);

		//Arranging the order of appearance of the Label,text and command buttons 
		//on the windows
		c.add(lblheading);c.add(lblheading1);
		c.add(lblroll);c.add(tfroll);
		c.add(lblname);c.add(tfname);
		c.add(lblmarks1);c.add(tfmarks1);
		c.add(lblmarks2);c.add(tfmarks2);
		c.add(btnregister);c.add(btnshow);
		c.add(btnsearch);c.add(btnpass);
		c.add(btnupdate);c.add(btndelete);
		c.add(btnreset);c.add(btnquit);

		//Adjusting the position of the Main Window
		setSize(500,500);
		setLocation(600,200);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//Unimplemented Method of the Interface ActionListener
	//Performs Click Action(Idea used in Event-Driven Programming Model)
	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == btnregister)
		{
			try
			{
				String n = tfname.getText().trim();
				String n1;
				int r = Integer.parseInt(tfroll.getText().trim());
				int m1 = Integer.parseInt(tfmarks1.getText().trim());
				int m2 = Integer.parseInt(tfmarks2.getText().trim());
				ValidNameCheck VDC = new ValidNameCheck();
				if((r>0) && (m1>=0 && m1<=100) && (m2>=0 && m2<=100) && (n.length()>0))
				{

					n1 = VDC.NameCheckConvert(n);

					if(n1 != null)
					{
						JOptionPane.showMessageDialog( null, "Registering the Students Information....."); 
						MyStudentInfo MSI = new MyStudentInfo(r,n1,m1,m2);
						new MyStudentAdd(MSI);
					}
					else
					{
						JOptionPane.showMessageDialog(null,"You have entered an Illegal name !!!!");
						String str  =new String();
						str = "\nA Student Name should satisfy the following criterias.....";
						str +="\n1.Every visible character should be an Albphabet.";
						str +="\n2.No Special Characters or numerals are allowed!!!";
						str +="\n3.Blank Spaces are allowed between names.";
						JOptionPane.showMessageDialog(null,str);
					}		
				}
				else
				{
					JOptionPane.showMessageDialog( null, "Please Enter a Valid Input!!!!");
					JOptionPane.showMessageDialog( null, "This is how each Student's attributes should be filled up.....");
					String Str = new String();
					Str = "1.Name cannot be a blank field.";
					Str += "\n2.Roll no. must be a positive Integer greater than 0.";
					Str += "\n3.Marks can be postive Integers greater than equal to 0 and less than equal to 100.";
					JOptionPane.showMessageDialog(null,Str);
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog( null, "Please Enter a Valid Input !!!!! (Exception)");
				JOptionPane.showMessageDialog( null, "This is how each Student fields should be filled up.....");
				String Str = new String();
				Str = "1.Name cannot be a blank field.";
				Str += "\n2.Roll no. must be a positive Integer greater than 0.";
				Str += "\n3.Marks can be postive Integers greater than equal to 0 and less than equal to 100.";
				JOptionPane.showMessageDialog(null,Str);
			}
		}
		else if(ae.getSource() == btnshow)		 
			new MyStudentShow();
		else if(ae.getSource() == btnsearch)
			new MyStudentSearch();
		else if(ae.getSource() == btnpass)
			new MyStudentPass();
		else if(ae.getSource() == btnupdate)
			new MyStudentUpdate();
		else if(ae.getSource() == btndelete)
			new MyStudentDelete();
		else if(ae.getSource() == btnreset)
		{
			JOptionPane.showMessageDialog( null,"Resetting.....");
			tfroll.setText("");
			tfname.setText("");
			tfmarks1.setText("");
			tfmarks2.setText("");
		}
		else if(ae.getSource() == btnquit)
		{
			System.exit(0);
		} 
	}

	public static void main(String args[])
	{
		new MyStudentReg();
	}
}