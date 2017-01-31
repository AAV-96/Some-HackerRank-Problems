/*
problem link: https://www.hackerrank.com/challenges/linkedin-practice-bitwise-and
*/
import java.io.*;
import java.util.*;

public class BitwiseAND {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t, n, k;
        t = sc.nextInt();
        for (int loop=0; loop<t; loop++) {
            n = sc.nextInt();
            k = sc.nextInt();
            int arr[] = new int[n];
            int max = -9999;
            for (int i=0; i<n; i++){
                arr[i] = i+1;
            }
            for (int i=0; i<n-1; i++) {
                for (int j=i+1; j<n; j++) {
                    int ll = arr[i]&arr[j];
                    if (max < ll && ll < k) max = ll;
                }
            }
            System.out.println(max);
        }
    }
}
