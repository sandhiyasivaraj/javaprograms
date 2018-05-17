import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber
{
    public static void main(String []args)
    {
        int N,j,i;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
         a[i]=in.nextInt();
        int count=0;
	    for(i=0;i<N;i++)
	    {
	    	for(j=i+1;j<N;j++)
	    	{
	    	    if(a[i]+a[j]==0)
	    	    {
	               	System.out.print(a[i]+" "+a[j]);   
	           	}
		    }
	    }
    }
}
