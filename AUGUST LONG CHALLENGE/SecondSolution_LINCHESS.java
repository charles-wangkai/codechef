/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc --> 0)
		{
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int cnt=0;
		    int min=9999999;
		    int val,result=0;
		    int [] arr = new int[n];
		    for(int i=0;i<n;++i)
		    arr[i]=sc.nextInt();
		    for(int i=0;i<n;++i)
		    {
		        if(k%arr[i]==0)
		        {
		            val = k/arr[i];
		            if(val<min)
		            {
		                min=val;
		                result = arr[i];
                        ++cnt;
		            }
		        }
		    }
		   if(cnt==0)
		   System.out.println(-1);
		   else
		   System.out.println(result);
		}
	}
}

