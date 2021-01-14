package twistage;

public class ReverseString {

	public static void reverseWord(String str) {
		// Reverse the string str
		StringBuffer mlt = new StringBuffer(str);
		StringBuffer result = mlt.reverse();
		String finaLresult = result.toString();
		System.out.println(finaLresult);
		
	}
	public static void main(String[] args) {

		String str = "-838383---Agnip";
		reverseWord(str);
		
			

		}


}
