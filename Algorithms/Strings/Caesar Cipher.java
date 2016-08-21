import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = "";
        String s = in.next();
        int k = in.nextInt();
        int l = s.length();
        if (k > 26){
            k = k%26;
        }
        for (int i=0; i<l; i++){
            char c = s.charAt(i);
            int ch = (int)c;
            if (ch >= 65 && ch <= 90){
                ch += k;
            
            if (ch > 90){
                ch = ch-26;
            }
            c = (char)ch;
                //str += c;
            }
            if (ch >= 97 && ch <= 122){
                ch += k;
            
            if (ch > 122){
                ch = ch-26;
            }
            c = (char)ch;
                //str += c;
            }
            str += c;
        }
    System.out.println(str);
    }}
