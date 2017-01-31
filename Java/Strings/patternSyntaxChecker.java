/*
problem : https://www.hackerrank.com/challenges/pattern-syntax-checker
*/
import java.util.Scanner;
import java.util.regex.*;

public class patternSyntaxChecker
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
         /*write your code here*/
         try{
            Pattern r = Pattern.compile(pattern);
            System.out.println("Valid");
         } catch(PatternSyntaxException e) {
             System.out.println("Invalid");             
         }                
         testCases--;
      }
   }
}
