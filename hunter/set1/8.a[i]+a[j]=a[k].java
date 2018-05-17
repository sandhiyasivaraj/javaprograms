import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber
{
    public static void main(String []args)
    {
        int N,j,i,k;
        int b[]=new int[]{-1,-1,-1};
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
         a[i]=in.nextInt();
	    for(i=0;i<N;i++)
	    {
	    	for(j=i+1;j<N;j++)
	    	{
	    	    for(k=j+1;k<N;k++)
	    	    {
	    	        if(a[i]+a[j]==a[k] && (a[i]!=b[0]&&a[j]!=b[1] || a[i]!=b[1]&&a[j]!=b[0]))
	    	        {
	               	    System.out.print(a[i]+" "+a[j]+" "+a[k]+"\n");   
	           	    }
	           	    b[0]=a[i];
	           	    b[1]=a[j];
	           	    b[2]=a[k];
	    	    }
		    }
	    }
    }
}
