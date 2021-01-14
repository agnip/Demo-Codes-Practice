package amazon.code.practice;

import java.util.HashMap;

public class FindNumberOfoccurrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,2,2, 7, 8,3, 0,1,5,6,7,5};
		 HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		 
		 for(int i= 0; i<a.length; i ++) {
			 char[] charr = String.valueOf(a[i]).toCharArray(); 
			 for(int j = 0; j<charr.length; j++) {
				 if (map.containsKey(charr[j])) {
					 map.put(charr[j],map.get(charr[j])+1);
				 }
				 else {
					 map.put(charr[j], 1);
				 }
			 }
		 }
		 System.out.println(map);

	}

}
