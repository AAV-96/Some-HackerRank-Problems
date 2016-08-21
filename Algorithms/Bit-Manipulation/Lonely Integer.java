import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int arr[] = new int[n];
		int ctr[] = new int[101];
		for (int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i=0; i<=100; i++) {
			ctr[i] = 0;
		}

		for (int i=0; i<n; i++) {
			ctr[arr[i]]++;
		}

		for (int i=0; i<=100; i++) {
			if (ctr[arr[i]] == 1) {
				System.out.println(arr[i]);
				break;
			}
		}
	}
}
