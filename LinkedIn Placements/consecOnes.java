/*
problem : https://www.hackerrank.com/challenges/linkedin-practice-binary-numbers
*/
import java.io.*;
import java.util.*;

public class consecOnes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        
        String bin = "";
        int ctr = 0, max = -9999;
        while (n > 0){
            int rem = n%2;
            
            bin = String.valueOf(rem)+bin;
            n /= 2;
        }
        
        for (int i=0; i<bin.length(); i++) {
            char ch = bin.charAt(i);
            if (ch == '1'){
                ctr++;
                if (max < ctr) max = ctr;
            } else {
                if (max < ctr) max = ctr;
                ctr = 0;
            }
        }
        System.out.println(max);
    }
}
