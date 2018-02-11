import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        //Write your code here
        
        // Boolean value to keep track of whether or not array s is sorted
        boolean isSorted = false;
        
        while (!isSorted)
        {
      	  // We will assume the array is sorted
      	  isSorted = true;
      	  
      	  // Compare two values at a time moving the lowest value to the back of the array
      	  // -1 because I am looking ahead 1 in the array and -2 because the array was initialized with 2 empty cells
      	  for (int i = 0; i < s.length - 1 - 2; i++)
      	  {
      		  
      		  // Create BigDecimal's numA and numB from the two values we want to compare in s[]
      		  BigDecimal numA = new BigDecimal(s[i]);
      		  BigDecimal numB = new BigDecimal(s[i + 1]);
      		  
      		  // If s[A] is less than s[B] then swap
      		  if(numA.compareTo(numB) < 0)
      		  {
      			  // Swap values
      			  String temp = s[i];
      			  s[i] = s[i + 1];
      			  s[i + 1] = temp;
      			  
      			  // Update isSorted value
      			  isSorted = false;
      		  }
      	  }
        }
        
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}