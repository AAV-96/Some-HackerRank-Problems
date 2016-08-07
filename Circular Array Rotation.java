import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, q, k;
		n = sc.nextInt();
		k = sc.nextInt();
		q = sc.nextInt();
		int idx = n;
		int arr[] = new int[n];

		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<(k%n); i++) {
			idx--;
                /*if (idx < 0){
                	idx = n-1;
                }*/
		}
				
		for (int i=0; i<q; i++) {
			int m = sc.nextInt();
                        int dd = (idx+m)%n;
                        /*if (dd < n) {
			     dd = idx+m;
                          } else {
                             dd = 0;
                          }  */  
                System.out.println(arr[dd]);
		}
	}
}