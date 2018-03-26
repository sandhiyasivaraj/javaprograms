/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int N,i,j,sum1=0,sum2=0,product;
		
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		int a[][]=new int[N][N];
		for(i=0;i<N;i++)
		{
			for(j=0;j<N;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
			for(i=0;i<N;i++)
		{
			sum1=sum1+a[i][i];
		
		}
			i=N-1;
		for(j=0;j<N;j++)
		{
			if(i>=0)
			{
			sum2=sum2+a[i][j];
				i--;
			}
		
		}
			product=sum1*sum2;		
			System.out.println(product);
		
		
	}
}
