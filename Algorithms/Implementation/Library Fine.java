import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int m1 = in.nextInt();
        int y1 = in.nextInt();
        int d2 = in.nextInt();
        int m2 = in.nextInt();
        int y2 = in.nextInt();
        int dy, dm, dd, fine;
        dy = y1-y2;
        dm = m1-m2;
        dd = d1-d2;
        if (dy < 0){
            fine = 0;
                    System.out.println(fine);
                    System.exit(0);
        }
        if (dy == 0){
            if (dm < 0){
                fine = 0;
                    System.out.println(fine);
                    System.exit(0);
            }
            if (dm == 0){
                if (dd <= 0){
                    fine = 0;
                    System.out.println(fine);
                    System.exit(0);
                }
                if (dd > 0){
                    fine = 15*dd;
                    System.out.println(fine);
                    System.exit(0);

                }
            }
            if (dm > 0){
                fine = 500*dm;
                System.out.println(fine);
                System.exit(0);
            }
        }
        if (dy > 0){
            fine = 10000;
            System.out.println(fine);
            System.exit(0);
        }
    }
}
