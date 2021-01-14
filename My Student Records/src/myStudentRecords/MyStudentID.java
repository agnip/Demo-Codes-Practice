package myStudentRecords;

import java.util.Scanner;

public class MyStudentID 
{
   MyStudentInfo stdlist[];
   Scanner sc = new Scanner(System.in);
   public void arryCreation()
   {
	   System.out.println("Enter no. of Students : " );
	   int stunum = sc.nextInt();
	   stdlist = new MyStudentInfo[stunum];
   }
   
   public void myDataInput()
   {
	   int i;
	   System.out.println("\n");
	   for(i=0;i<stdlist.length;i++)
	   {
		   stdlist[i] = new MyStudentInfo();
		   System.out.println("Enter Info for Student " + (i+1) + ".....");
		   System.out.println("Enter Roll : ");
		   stdlist[i].setRoll(sc.nextInt());
		   System.out.println("Enter Name : ");
		   stdlist[i].setName(sc.next());
		   System.out.println("Enter Marks for Subject 1 : ");
		   stdlist[i].setMarks1(sc.nextDouble());
		   System.out.println("Enter Marks for Subject 2 : ");
		   stdlist[i].setMarks2(sc.nextDouble());
	   }
   }

   public void display()
   {
	   int i=1;
	   System.out.println("\n");
	   System.out.println("Displaying the Results.....");
	   for(MyStudentInfo std : stdlist)
	   {
		   System.out.println("Info for Student " + i);
		   System.out.println("Roll : " + std.getRoll());
		   System.out.println("Name : " + std.getName());
		   System.out.println("Marks......");
		   System.out.println("Subject 1 : " + std.getMarks1() + " Subject 2 : " + std.getMarks2());
	   }
   }
}
