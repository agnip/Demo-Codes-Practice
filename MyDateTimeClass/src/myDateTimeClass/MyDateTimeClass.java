package myDateTimeClass;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class MyDateTimeClass 
{
   public void myShowDate()
   {
	   LocalDate today = LocalDate.now();
	   System.out.println("Current Date : " + today);
	   int day = today.getDayOfMonth();
	   int month = today.getMonthValue();
	   int year = today.getYear();
	   System.out.println("Date : " + day + " Month : " + month + " Year : " + year);
	   
	   StringTokenizer stk = new StringTokenizer(today.toString(),"-");
	   System.out.println(stk.nextToken());
	   System.out.println(stk.nextToken());
	   System.out.println(stk.nextToken());
   }
   
   public void myShowTime()
   {
	   LocalTime  time = LocalTime.now();
	   System.out.println("Curent  time : " + time);
	   int hour = time.getHour();
	   int minute = time.getMinute();
	   int second = time.getSecond();
	   System.out.println("Hour : " + hour + " Minute : " + minute + " Second : " + second);
   }
   public static void main(String a[])
   {
	   MyDateTimeClass mdtc = new MyDateTimeClass();
	   mdtc.myShowDate();
	   mdtc.myShowTime();
   }
}
