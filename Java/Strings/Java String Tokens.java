import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = "";
        int ctr = 0;
        //scan.close();
        String dl = " !,?._'@"; // delimiters
        StringTokenizer st = new StringTokenizer(s, dl);
        ctr = st.countTokens();
        System.out.println(ctr);
        while (st.hasMoreTokens()) {
            x = st.nextToken();           
            System.out.println(x);
        }

        // Write your code here.
    }
}

