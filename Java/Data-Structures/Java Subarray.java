import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int k=0,d=0,s=0;
        int a[]=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for (int i=0;i<n;i++){
            s=0;
            for(int j=i;j<n;j++){
               
                s+=a[j];
                if (s<0)
                    d++;
            }
            
        }
        System.out.println(d);
    }
}
