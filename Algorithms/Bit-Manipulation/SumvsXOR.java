import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long solve(long n) {
        long ctr = 0L;
        /*for (long i = 0L; i<=n; i++) {
            if ((n+i) == (n^i)) {
                ctr++;
            }
        }*/
        //counting the no. of zeroes
        while (n > 0) {
            ctr += (n%2 == 0)?1:0;
            n /= 2;
        }
        return (long)Math.pow(2, ctr);       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
