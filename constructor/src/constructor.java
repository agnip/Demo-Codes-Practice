public class constructor 
{
	  int age,sal;
	  public constructor()
	  {
		  age=25;
		  sal=25000;
	  }
	  void mydisplay()
	  {
		  System.out.println("\tAge : " + age + "\n\tSalary : " + sal);
	  }
	  public static void main(String args[])
	  {
		  constructor cd = new constructor();
		  cd.mydisplay();
	  }
}