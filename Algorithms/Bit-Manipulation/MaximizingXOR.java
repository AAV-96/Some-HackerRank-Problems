import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l, r, a, b, x = 0, max = -9999;
        l = sc.nextInt();
        r = sc.nextInt();
        for (a=l; a<=r; a++) {
            for (b=a; b<=r; b++) {
                x = a^b;
                if (max < x){
                    max = x;
                }
            }
        }
        System.out.println(max);
    }
}
