package twistage;

public class Palindrome {
	
	 public static boolean isPalindrome(int x) {
		 
		 boolean check;
		 
		 String new1 = String.valueOf(x);
		 StringBuffer str = new StringBuffer(new1);
		 StringBuffer cur = str.reverse();
		 String new2 = cur.toString();
		 System.out.println("new1: "+new1);
		 System.out.println("new2: "+new2);
		 if(new1==new2) {
			 check=true; 
			 return check;
		 }
		 else {
			 
			 check=false;
			 return check;
		 }
		  
	        
	    }
	 
	 public static void main(String[] args) {

		int x = 8887098;
		isPalindrome(x);
		
			

		}

	}