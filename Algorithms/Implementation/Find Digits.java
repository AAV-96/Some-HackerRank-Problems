import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int ctr=0;
            int d,c;
            int n = in.nextInt();
            c=n;
            while(c!=0){
                d=c%10;
                if(d!=0 && n%d==0)
                    ctr++;
                c=c/10;
            }
            System.out.println(+ctr);
        }
    }
}
