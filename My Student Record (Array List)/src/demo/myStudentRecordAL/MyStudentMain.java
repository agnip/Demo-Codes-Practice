package demo.myStudentRecordAL;

public class MyStudentMain 
{
   public static void main(String args[])
   {
	   MyStudentID msid= new MyStudentID();
	   msid.myDataInput();
	   msid.myDataDisplay();
	   msid.myDeleteData();
	   msid.myDataDisplay();
	   System.out.println("End of the Program.....");
   }
}
