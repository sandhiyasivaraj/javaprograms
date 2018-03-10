/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,n1,sum=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		n1=n;
		while(n!=0)
		{
			int r=n%10;
			int cube=r*r*r;
			sum=sum+cube;
			n=n/10;
		}
		if(sum==n1)
		{
		System.out.println("n is an armstrong number");
		}
		else
		{
		System.out.println("n is not an armstrong number");
		}
	}
}
