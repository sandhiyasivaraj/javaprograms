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
        int f=1;
        try
        {
		int N=in.nextInt();
		for(int i=1;i<=N;i++)
		{
			f=f*i;
		}
		System.out.println(f);
		}
		catch(Exception e)
		{
		System.out.println(1);
		}
	}
}
