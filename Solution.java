import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		int max = -9999, min = 9999;
		int l;
		int x[] = new int[n];
		int ctr = 0;
		for (int i=0; i<n; i++){
			x[i] = sc.nextInt();
		}

		for (int i=0; i<n; i++){
			if (max < x[i]){
				max = x[i];
			}
			if (min > x[i]){
				min = x[i];
			}
		}
		int h = 2;
		int hcf;
		/*for (int i=0; i<n; i++){
			/*if (x[i]%h == 0 && h <= min){
				ctr++;
			} else {
				h++;
				i = 0;
				ctr = 0;
			}

		}*/
		/*if (ctr == n){
			hcf = h;
		} else {
			hcf = 1;
		}*/

		while(min%h != 0){
			h++;
		}
		if (h <= min){
			hcf = h;
		} else {
		hcf = 1;
		}

		int xtr = 0;

		for (int i=0; i<n; i++){
			if (x[i]%min == 0){
				xtr++;
			}
		}
		if (xtr == n)
			hcf = min;

		//System.out.println("hcf = "+hcf);

		for (int i=k; i>=0; i--){
			if (hcf == 1){
				System.out.println("0");
				break;
			}
			if (hcf != 1 && i%hcf == 0){
				System.out.println(i);
				break;
			}
		}
	}
}
