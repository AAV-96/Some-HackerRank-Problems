import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int x, y;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println(e);
            
        }
        catch(InputMismatchException f){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
