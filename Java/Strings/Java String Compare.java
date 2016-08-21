import java.io.*;
import java.util.Scanner;

class jsc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s, str, min, max;
		int k;
		s = sc.next();
		k = sc.nextInt();
		str = "";
		min ="";
		min = s.substring(s.length()-k, s.length());
		max = "";
		for (int i=0; i<s.length()-k; i++){
			str = s.substring(i, i+k);
			if (str.compareTo(min)<0){
				min = str;
			}
			if (str.compareTo(max)>=0){
				max = str;
			}
		}
        if (k == s.length())
            max = s;
	System.out.println(min);
	System.out.println(max);
}}
		
