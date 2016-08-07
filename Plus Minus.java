import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        double a=0.0,b=0.0,c=0.0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]>0)
                a++;
            else if(arr[arr_i]==0)
                c++;
            else
                b++;
        }
        System.out.println((double)a/n+"\n"+(double)b/n+"\n"+(double)c/n);
    }
}
