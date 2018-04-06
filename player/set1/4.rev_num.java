/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n,rev=0;
        try
        {
		int N=in.nextInt();
	
		while(N>0)
		{
		    n=N%10;
		    
		    rev=rev*10+n;
		    
		    N=N/10;
		    
		}
		System.out.println(rev);
        }
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
