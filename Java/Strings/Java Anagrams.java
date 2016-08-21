import java.io.*;
import java.util.*;

public class Solution {

   static boolean isAnagram(String A, String B) {
      int l1,l2;
       int flag=1;
       A=A.toLowerCase();
       B=B.toLowerCase();
       l1=A.length();
       l2=B.length();
       char c,d;
       int a[]=new int[26];
       int b[]=new int[26];
       for(int i=0;i<l1;i++){
           c=A.charAt(i);
           a[(int)c-97]++;
       }
       for(int j=0;j<l2;j++){
           d=B.charAt(j);
           b[(int)d-97]++;
       }
       if(a.length==b.length){
           for(int i=0;i<a.length;i++){
               if(a[i]!=b[i])
                   flag=-1;
           }
       }
       if(flag==-1)
           return false;
       else
           return true;
   
   }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
        
    }
}
