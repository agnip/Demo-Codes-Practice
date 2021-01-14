package demo.interfaceprojdemo;

public class myClassThree extends myClassTwo 
{
	public static void main(String args[])
	{
		myInterfaceTwo m4 = new myClassTwo();
		m4.myFunction11();
		m4.myFunction12();
		m4.myFunction21();
		m4.myFunction22();
		System.out.println(".......................\n");
		myInterfaceOne m3 = new myClassTwo();
		m3.myFunction11();
		m3.myFunction12();
		System.out.println(".......................\n");
		myInterfaceOne m2 = new myInterfaceOne()
		{
			public void myFunction11() 
			{
				System.out.println("11 is back...");			
			}

			public void myFunction12() 
			{
				System.out.println("12 is back...");				
			}
		};
		m2.myFunction11();
		m2.myFunction12();
		System.out.println(".......................\n");
		myClassThree m = new myClassThree();
		m.myFunction11();
		m.myFunction12();
		m.myFunction21();
		m.myFunction22();
		System.out.println(m.myFunction13());
		System.out.println(myClassTwo.myFunction14());
	}
}
