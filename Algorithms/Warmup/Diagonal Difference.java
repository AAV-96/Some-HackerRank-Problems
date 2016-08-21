import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int sum1=0,sum2=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            sum1=sum1+a[i][i];
            sum2=sum2+a[i][n-1-i];
        }
        if(sum1>sum2)
            System.out.println(+(sum1-sum2));
        else
            System.out.println(+(sum2-sum1));
    }
}
