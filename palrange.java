/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main(String[] args) 
	{
		int n, b, rev = 0;
		int n1,n2;
		Scanner in=new Scanner(System.in);
		n1=in.nextInt();
		n2=in.nextInt();
		for (int i = n1; i <= n2; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
		
	}
		
}
