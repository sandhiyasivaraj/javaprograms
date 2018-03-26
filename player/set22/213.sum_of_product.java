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
		int N,i,j,sum,product1=1,product2=1;
		
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
			product1*=a[i][i];
		
		}
		//System.out.println(product1);
		i=N-1;
			for(j=0;j<N;j++)
			{
			if(i>=0)
		{
		
			product2*=a[i][j];
			i--;
		}
		}
	//	System.out.println(product2);
			sum=product1+product2;		
			System.out.println(sum);
		
		
	}
}
