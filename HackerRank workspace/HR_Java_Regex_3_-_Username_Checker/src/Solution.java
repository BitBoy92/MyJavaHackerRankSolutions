import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String username = in.nextLine();
         //String pattern = Complete this line in the editable area below  
         
         /**********************My Work****************************/
         
         String pattern = "^[a-zA-Z]\\w{7,29}"; // At beginning of line on alphabetic character, between 7 and 29 word chracters until line end

         
         /**********************My Work****************************/
         
         Pattern r = Pattern.compile(pattern);
         Matcher m = r.matcher(username);
          
         if (m.find( )) {
            System.out.println("Valid");
         } else {
            System.out.println("Invalid");
         }
         testCases--;
      }
   }
}
