import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeInWords {

    static String con(int a)
    {
        switch(a) {
            case 1: return "one"; //break;
            case 2: return "two"; //break;
            case 3: return "three"; //break;
            case 4: return "four"; //break;
            case 5: return "five"; //break;
            case 6: return "six"; //break;
            case 7: return "seven";// break;
            case 8: return "eight"; //break;
            case 9: return "nine"; //break;
            case 10: return "ten"; //break;
            case 11: return "eleven";// break;
            case 12: return "twelve"; //break;
            case 13: return "thirteen"; //break;
            case 14: return "fourteen"; //break;
            case 15: return "fifteen"; //break;
            case 16: return "sixteen"; //break;
            case 17: return "seventeen"; //break;
            case 18: return "eighteen"; //break;
            case 19: return "nineteen"; //break;
            case 20: return "twenty"; //break;
            case 21: return "twenty one"; //break;
            case 22: return "twenty two"; //break;
            case 23: return "twenty three"; //break;
            case 24: return "twenty four"; //break;
            case 25: return "twenty five"; //break;
            case 26: return "twenty six"; //break;
            case 27: return "twenty seven"; //break;
            case 28: return "twenty eight"; //break;
            case 29: return "twenty nine"; //break;
            }
        return "";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
	if (m == 0){
		switch(h) {
			case 1: System.out.println("one o' clock"); break;
			case 2: System.out.println("two o' clock"); break;
			case 3: System.out.println("three o' clock");break;
			case 4: System.out.println("four o' clock");break;
			case 5: System.out.println("five o' clock");break;
			case 6: System.out.println("six o' clock");break;
			case 7: System.out.println("seven o' clock");break;
			case 8: System.out.println("eight o' clock");break;
			case 9: System.out.println("nine o' clock");break;
			case 10: System.out.println("ten o' clock");break;
			case 11: System.out.println("eleven o' clock");break;
			case 12: System.out.println("twelve o' clock");break;
    		}
	} // end of if
        else if(m == 15){
            System.out.println("quarter past "+con(h));
        }
	else if (m < 30) {
		System.out.println(con(m)+" minutes past "+con(h));
	}
	else if (m == 30) {
		System.out.println("half past "+con(h));
	}
    else if (m == 45){
        System.out.println("quarter to "+con(h+1));
    }
	
	else {
		System.out.println(con(60-m)+" minutes to "+con(h+1));
	}
     }// end of main
}
	
