import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        double x1,y,z;
        x1 = Math.pow(2,15);
        y = Math.pow(2,31);
        z = Math.pow(2,63);

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x >= -x1 && x <= x1-1)System.out.println("* short");
                if(x >= -y && x <= y-1)System.out.println("* int");
                if(x >= -z && x <= z-1)System.out.println("* long");
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
