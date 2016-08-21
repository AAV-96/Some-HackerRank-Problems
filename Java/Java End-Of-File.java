import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i=1;
        String s = sc.nextLine();
        do {
            System.out.println(i+" "+s);
            i++;
            s = sc.nextLine();
        }while (sc.hasNextLine());
        System.out.println(i+" "+s);
    }
}
