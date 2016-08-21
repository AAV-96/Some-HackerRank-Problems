import java.io.*;
import java.util.*;

class LisaWrkbk
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, k;
		n = sc.nextInt();
		k = sc.nextInt();
		//int book[][] = new int[100][100];
		int counter = 0;
		int i = -1;
        	int pt = 0;
       
		//for (int i=0; i<n;i++){
					
			//for (int i = 0; i<99999; i++) { //pages
				for (int j=0; j<n; j++) {//chapters
                    			++i;
                    			pt = 0;
					int x = sc.nextInt();//questions
					for (int m=0; m<x; m++) {
                        
						if (m+1 <= k) {
							//book[j][m] = m+1;
                           				pt++;
                            				//if (m == i)
						   //   counter++;
                            //System.out.println("i="+(i+1)+"\t j="+(j+1)+"\t m="+(m+1)+"\t ctr="+counter);
                       				}  else if (pt == 0 || m%k == 0) {
							++i;
                            				pt++;
                            				//k = k*2;
                           				//pt++;
                            
                            				if (pt == k)
                                				pt = 0;
							//book[j][m] = m+1;
                           
                            				//if (m == i)
							//     counter++;
                          				//  System.out.println("i="+(i+1)+"\t j="+(j+1)+"\t m="+(m+1)+"\t ctr="+counter);
						}
                        		if (m == i)
                            			counter++;
                        
                        //System.out.println("i="+(i+1)+"\t j="+(j+1)+"\t m="+(m+1)+"\t pt="+(pt)+"\t ctr="+counter);
						
					}//end of m
				}//end of j
			//}//end of i
		System.out.println(counter);
	}
}
