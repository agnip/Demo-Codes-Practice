package myStuReg;

import java.io.Serializable;

@SuppressWarnings("serial")

//MyStudentInfo class specifies the fields of a student to be entered
public class MyStudentInfo implements Serializable
{
	int roll,marks1,marks2;
	String name;
	static boolean test = false;

	//Default Constructor
	public MyStudentInfo( )
	{

	}

	//Parameterised Constructor	
	public MyStudentInfo(int r,String n,int m1,int m2)
	{
		roll = r;
		name = n;
		marks1 = m1;
		marks2 = m2;
	}

	//Setter and Getter Functions for every data member    
	int getRoll()
	{
		return roll;
	}

	String getName()
	{
		return name;
	}

	int getMarks1()
	{
		return marks1;
	}

	int getMarks2()
	{
		return marks2;
	}

	void setRoll(int r)
	{
		roll = r;
	}

	void setName(String n)
	{
		name = n;
	}

	void setMarks1(int m2)
	{
		marks1 = m2;
	}

	void setMarks2(int m2)
	{
		marks2 = m2;
	}
}
