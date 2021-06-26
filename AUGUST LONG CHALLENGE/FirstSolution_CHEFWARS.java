/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class codechef1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int tc = sc.nextInt();
	    while(tc-- > 0)
	    {
	        int health = sc.nextInt();
	        int power = sc.nextInt();
	        
	        while(true)
	        {
	            health = health - power;
	            power = power/2;
	            
	            if(health <= 0)
	            {
	                System.out.println(1);
	                break;
	            }else if(power <= 0)
	            {
	                System.out.println(0);
	                break;
	            }
	        }
	    }
	}
}

