/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,n1,re=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		n1=n;
		while(n!=0)
		{
			int r=n%10;
			re=re*10+r;
			
			n=n/10;
		}
		if(re==n1)
		{
		System.out.println("n is a palindrome");
		}
		else
		{
		System.out.println("n is not a palindromer");
		}
	}
}
