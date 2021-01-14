public class constructordemo 
{
  int age,sal;
  public constructordemo()
  {
	  age=25;
	  sal=25000;
  }
  void mydisplay()
  {
	  System.out.println("\tAge : " + age + "Salary : " + sal);
  }
  public static void main(String args[])
  {
	  constructordemo cd = new constructordemo();
	  cd.mydisplay();
  }
}
