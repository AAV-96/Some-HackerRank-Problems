import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min;
        int ctr;
        System.out.println(+n);
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();}
        do{
            ctr=0;
            min=9999;
            for(int i=0;i<n;i++){
                if(arr[i]>0 && min>arr[i])
                    min=arr[i];}
            for(int i=0;i<n;i++){
                arr[i]=arr[i]-min;
                if(arr[i]>0)
                    ctr++;
        }
            if(ctr>0)
                System.out.println(+ctr);
        }
        while(ctr!=0);
    }
}
