import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t=n-1;
        for(int i=0;i<n;i++){
            for(int j=n-1-i;j>0;j--){
                System.out.print(" ");}
            for(int k=n-t;k>0;k--){
                System.out.print("#");
                }
            System.out.println();
            t--;
        }
    }
}
