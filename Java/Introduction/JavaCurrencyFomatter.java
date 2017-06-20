import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaCurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

		    NumberFormat nf;
		    nf = NumberFormat.getCurrencyInstance(Locale.US);
		    String str, us, india, france, china; 
		    str = nf.format(payment);
		    us = str;
		    nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		    india = us;
		    india = india.replace("$", "Rs.");
		    france = nf.format(payment);
		    nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
		    china = nf.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
