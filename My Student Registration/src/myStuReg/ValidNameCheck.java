package myStuReg;

public class ValidNameCheck 
{

	public String NameCheckConvert(String n)
	{
		int i,j; 
		char s[ ] = new char[n.length()];
		String s1;
		for(i=0;i<n.length();i++)
		{
			s[i] = n.charAt(i);
			j = (int) s[i];

			//Checking whether the name is Valid    		  
			if((j>=65 && j<=90) || (j>=97 && j<=122) || (s[i] == ' '))
			{
				//Converting the first letter of every word in the name to UpperCase    			  
				if(i==0 && (j>=97 && j <=122))   
					s[i] = (char)(j-32);          
				else if(i!=0 && (n.charAt(i-1) == ' ') && (j>=97 && j<=122))
					s[i] = (char)(j-32);
				else if(i != 0 && (j>=65 && j<=90) && (n.charAt(i-1) != ' '))
					s[i] = (char)(j+32);
			}
			else
			{
				return null;
			}
		}

		s1 = new String(s);
		return s1;
	}
}