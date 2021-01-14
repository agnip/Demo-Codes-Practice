package demo.myStudentRecordAL;

public class MyStudentInfo 
{
   private int stRoll;
   private String stName;
   private double stMarks1,stMarks2;
   static int i;
   
   public int getRoll()
   {
	   return stRoll;
   }
   
   public String getName()
   {
	   return stName;
   }
   
   public double getMarks1()
   {
	   return stMarks1;
   }
   
   public double getMarks2()
   {
	   return stMarks2;
   }
   
   public void setRoll(int r)
   {
	   stRoll = r;
   }
   
   public void setName(String n)
   {
	   stName = n;
   }
   
   public void setMarks1(double r)
   {
	   stMarks1 = r;
   }
   
   public void setMarks2(double r)
   {
	   stMarks2 = r;
   }
}
