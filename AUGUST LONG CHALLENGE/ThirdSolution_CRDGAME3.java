/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
/* Name of the class has to be "Main" only if the class is public. */
class codechef3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();

		while(tc --> 0)
		{
		    int p1=0;
		    int p2=0;
		    int c = sc.nextInt();
		    int r = sc.nextInt();
		   
		    if(c<=9)
		    p1=1;
		    else
		    {
		    	p1 = c/9;
		    	if(c%9!=0)
			p1=p1+1;			
            	    }        
	       	    if(r<=9)
		    p2=1;
		    else
		   {
		    	p2 = r/9;
		 	if(r%9!=0)
		 	p2=p2+1;	    
		   }
		    if(p1<p2)
		    System.out.println("0" + " " + p1);
		    else
		    System.out.println("1" + " " + p2);
		    
		}
	}
}

