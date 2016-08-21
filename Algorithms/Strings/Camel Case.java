import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Camel Case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int ctr = 1;
        int l = s.length();
        for (int i=0; i<l; i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)){
                ctr++;
            }
        }
        System.out.println(ctr);
    }
}
