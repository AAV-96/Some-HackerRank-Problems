import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=0, b=0;
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        if (a0 > b0){
            a++;
        } else if (b0 > a0) {
            b++;
        }
        if (a1 > b1){
            a++;
        } else if (b1 > a1){
            b++;
        }
        if (a2 > b2){
            a++;
        } else if (b2 > a2){
            b++;
        }
        System.out.println(a+" "+b);
    }
}
