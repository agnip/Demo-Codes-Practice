package demo.myStudentRecordAL;

import java.util.ArrayList;
import java.util.Scanner;

public class MyStudentID 
{
   Scanner sc = new Scanner(System.in);
   ArrayList<MyStudentInfo> stdlist = new ArrayList<MyStudentInfo>();
   String answer;
   
   public void myDataInput()
   {
	   System.out.println("");
	   System.out.println("Retriving Student Info from the User....");
	   do
	   {
		  MyStudentInfo std = new MyStudentInfo();
	      System.out.println("Enter Info for Student " + (++MyStudentInfo.i) + ".....");
	      System.out.println("Enter Roll : ");
	      std.setRoll(sc.nextInt());
	      System.out.println("Enter Name : ");
	      std.setName(sc.next());
	      System.out.println("Enter Marks for Subject 1 : ");
	      std.setMarks1(sc.nextDouble());
	      System.out.println("Enter Marks for Subject 2 : ");
	      std.setMarks2(sc.nextDouble());
	      stdlist.add(std);
	      System.out.println("Wanna add more records ? (Y/N)");
	      answer = sc.next();
	      System.out.println("");
	   }while(answer.equalsIgnoreCase("Y"));
   }
   
   public void myDataDisplay()
   {
	   int i=1;
	   System.out.println("");
	   System.out.println("Displaying the Results.....");
	   for(MyStudentInfo std : stdlist)
	   {
		   System.out.println("Info for Student " + i + ".....");
		   System.out.println("Roll : " + std.getRoll());
		   System.out.println("Name : " + std.getName());
		   System.out.println("Marks......");
		   System.out.println("Subject 1 : " + std.getMarks1() + " Subject 2 : " + std.getMarks2());
		   i++;
		   System.out.println("");
	   }
   }

   public void myDeleteData()
   {
	   System.out.println("Data Deletion Operation....");
	   System.out.println("Enter Roll No. of the Student whose data you want to delete : ");
	   int i,roll = sc.nextInt();
	   boolean flag = false;
	   for(i=0;i<stdlist.size();i++)
	   {
		   MyStudentInfo std = stdlist.get(i);
		   if(std.getRoll()==roll)
		   {
			   System.out.println("Record Found...");
			   System.out.println("Data Info to be Deleted....");
			   System.out.println("Roll No. : " + roll + " Name : " + std.getName());
			   flag = true;
			   stdlist.remove(i);
			   break;
		   }
	   }
	   if(!flag)
		   System.out.println("Record with Roll " + roll + " is not present.");
   }
}
