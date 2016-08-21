import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		for (int i=0; i<t; i++) {
			int m, n;
			m = sc.nextInt();
			n = sc.nextInt();
			int flag = 1;
			int arr[] = new int[n];
			for (int j=0; j<n;j++) {
				arr[j] = sc.nextInt();
			}
			for (int k=0; k<n-1; k++) {
				for (int l=k+1; l<n; l++) {
					if ((arr[k]+arr[l]) == m) {
						System.out.println((k+1)+" "+(l+1));
						flag = -1;
					}
				if (flag == -1) {
					break;
				}
				}
				if (flag == -1) {
					break;
				}
			}
		}
	}
}
