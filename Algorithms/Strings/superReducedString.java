/*
problem : https://www.hackerrank.com/challenges/reduced-string
*/
import java.io.*;
import java.util.*;

public class superReducedString {

    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        String s1;
        s1 = sc.next();
        int len = s1.length();
        while (s1.length() != 0){
            
        for (int i=0; i<len-1; i++) {
              if (s1.charAt(i) == s1.charAt(i+1)){
                  
                    s1 = s1.substring(0, i)+s1.substring(i+2, len);
                  
                  len = s1.length();
                  i=0;
              }         
        }
          if (s1.length() > 0 && s1.charAt(0) != s1.charAt(1)) break;
        }
        if (s1.length() == 0){
            System.out.println("Empty String");
        } else {
            System.out.println(s1);
        }
    }
}
