import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        for (int a=0; a<t; a++) {
            String s = sc.next();
            int l = s.length();
            int flag = 1;
            for (int i=1; i<l; i++){
                char c = s.charAt(i);
                char cc = s.charAt(i-1);
                char d = s.charAt(l-i);
                char dd = s.charAt(l-i-1);
                int dx = Math.abs((int)c - (int)cc);
                int dy = Math.abs((int)dd - (int)d);
                if (dx != dy){
                    flag = -1;
                    break;
                }
                
            }
            if (flag == 1){
                System.out.println("Funny");
            } else {
                System.out.println("Not Funny");
            }
        }
    }
}
