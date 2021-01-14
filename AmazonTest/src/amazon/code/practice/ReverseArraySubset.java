package amazon.code.practice;

public class ReverseArraySubset { 
   public static void main(String[] args) { 
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10}; 
      int size = 4; 
      int n = arr.length; 
      System.out.print("Original array is: ");

      for (int i = 0; i < n; i++) 
         System.out.print(arr[i] + " ");
      
      
         for (int i = 0; i < n; i =i+ size) { 
            int start = i; 
            int end = Math.min(i + size - 1, n - 1); 
            int temp; 

            while (start < end) { 
               temp = arr[start]; 
               arr[start] = arr[end]; 
               arr[end] = temp; 
               start ++; 
               end --; 
            } 
         }  
         System.out.print("\nModified array is: ");
         for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
   } 
}