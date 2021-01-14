package myStuReg;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyStudentReg extends JFrame implements ActionListener 
{
   JLabel lblheading,lblroll,lblname,lblmarks1,lblmarks2;
   JTextField tfroll,tfname,tfmarks1,tfmarks2;
   JButton btnreset,btnregister,btnshow,btnsearch,btnupdate,btnpass,btndelete,btnquit;
   Container c;
   
   public MyStudentReg()
   {
	   super("Student Registration Project");
	   c = getContentPane();
	   c.setLayout(new GridLayout(9,2));
   
       Font F1 = new Font("Lucida Fox",Font.ITALIC,8);
       Font F2 = new Font("Algerian",Font.ITALIC,16);
	   
	   lblheading  = new JLabel("  Student Registration Form ");
	   lblheading.setFont(F1);
       lblroll  = new JLabel("  Enter Roll : ");
       lblheading.setFont(F2);
       lblname  = new JLabel("  Enter Name : ");
       lblheading.setFont(F2);
       lblmarks1  = new JLabel("  Enter Marks 1 : ");
       lblheading.setFont(F2);
       lblmarks2  = new JLabel("  Enter Marks 2 : ");
       lblheading.setFont(F2);
       
       tfroll = new JTextField(20);
       tfname = new JTextField(20);
       tfmarks1 = new JTextField(20);
       tfmarks2 = new JTextField(20);
       
       btnreset = new JButton("Reset");
       btnshow = new JButton("Show All");
       btnsearch = new JButton("Student Search");
       btnupdate = new JButton("Update Marks");
       btnregister = new JButton("Register");
       btnpass = new JButton("Student Passed");
       btndelete = new JButton("Student Delete");
       btnquit = new JButton("Quit");
       
       btnreset.addActionListener(this);
       btnshow.addActionListener(this);
       btnsearch.addActionListener(this);
       btnupdate.addActionListener(this);
       btnregister.addActionListener(this);
       btnpass.addActionListener(this);
       btndelete.addActionListener(this);
       btnquit.addActionListener(this);
       
       
       c.add(lblheading);c.add(new JLabel(""));
       c.add(lblroll);c.add(tfroll);
       c.add(lblname);c.add(tfname);
       c.add(lblmarks1);c.add(tfmarks1);
       c.add(lblmarks2);c.add(tfmarks2);
       c.add(btnreset);c.add(btnshow);
       c.add(btnsearch);c.add(btnupdate);
       c.add(btnregister);c.add(btnpass);
       c.add(btndelete);c.add(btnquit);
       
       setSize(500,500);
       setLocation(400,400);
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
   }
   
   public void actionPerformed(ActionEvent ae) 
   {
	   if(ae.getSource() == btnregister)
       {
           String n = tfname.getText().trim();
	       int r = Integer.parseInt(tfroll.getText().trim());
	       int m1 = Integer.parseInt(tfmarks1.getText().trim());
	       int m2 = Integer.parseInt(tfmarks2.getText().trim());
	       JOptionPane.showMessageDialog(null,"Register Button Executing....");
		   MyStudentInfo MSI = new MyStudentInfo(r,n,m1,m2);
    	   new MyStudentAdd(MSI);
       }
	   else if(ae.getSource() == btnshow)
	   {
		   JOptionPane.showMessageDialog(null,"Show All Button Executing....");
		   new MyStudentShow();
	   }
	   else if(ae.getSource() == btnpass)
	   {
		   JOptionPane.showMessageDialog(null,"Student Passed Button Executing....");
		   new MyStudentPass();
	   }
	   else if(ae.getSource() == btndelete)
	   {
		   JOptionPane.showMessageDialog(null,"Student Delete Button Executing....");
		   new MyStudentDelete();
	   }
	   else if(ae.getSource() == btnsearch)
	   {
		   JOptionPane.showMessageDialog(null,"Student Search Button Executing....");
		   new MyStudentSearch();
	   }
	   else if(ae.getSource() == btnquit)
		   System.exit(0);
	   else if(ae.getSource() == btnreset)
	   {
		   tfroll.setText("");
		   tfname.setText("");
		   tfmarks1.setText("");
		   tfmarks2.setText("");
	   }
	   else if(ae.getSource() == btnupdate)
	   {
		   new MyStudentUpdate();
	   }
   }
   
   public static void main(String args[])
   {
	   MyStudentReg M = new MyStudentReg();
   }

}
