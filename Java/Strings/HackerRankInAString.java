import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while (q-- > 0){
            String str, s = "hackerrank";
            str = sc.next();
            int t = 0;
            //l1 = str.length();
            //l2 = s.length();
            if (str.length() < s.length()){
                System.out.println("NO");
                continue;
            }
            for (int i=0; i<str.length(); i++) {
                //System.out.println(str.charAt(i)+" == "+s.charAt(t));
                if (t < s.length() && str.charAt(i) == s.charAt(t)) {
                    t++;
                }
            }
            //System.out.println(t+" == "+l);
            System.out.println((t == s.length())?"YES":"NO");           
        }
    }
}
