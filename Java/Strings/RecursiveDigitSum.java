import java.io.*;
import java.util.*;

public class Solution {

    //sum of digits
    long sod(long P){
        long cpy = P;
        long sum = 0;
        long d = 0;
        
        while (cpy != 0){
            d = cpy%10;
            sum += d;
            cpy /= 10;
        }
        
        return sum;
    }
    
    //super digit
    long sup(long P){
        if (P < 10){
            return P;
        }
        return sup(sod(P));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long k;
        long P = 0L;
        String n;
        n = sc.next();
        k = sc.nextLong();
        //Multiply k with each digit individually
        for (int i=0; i<n.length(); i++) {
            P = P + (Integer.parseInt(String.valueOf(n.charAt(i)))*k);
        }
        Solution obj = new Solution();
        System.out.println(obj.sup(P));
    }
}
