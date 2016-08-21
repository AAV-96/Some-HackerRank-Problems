import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String t = in.next();
        String sub = "";
        String str = "";
        sub = t.substring(0,2);
        int x, l;
        l = t.length();
        x = Integer.parseInt(sub);
        char c;
        c = t.charAt(l-2);
        if (c == 'P'){
            x += 12;
            if (x >= 24){
                x -= 12;
            }
        
        sub = Integer.toString(x);
        str += sub;
      
        for (int i=2; i<l-2; i++){
            c = t.charAt(i);
            str += c;
        }
        } else {
            int i = 0;
            if (t.charAt(0) == '1' && t.charAt(1) == '2'){
                i = 2;
                str += "00";
            }
            for ( ; i<l-2; i++){
                c = t.charAt(i);
                str += c;
            }
        }
        System.out.println(str);
    }
}
