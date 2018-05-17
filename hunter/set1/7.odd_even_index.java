import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber
{
    public static void main(String []args)
    {
        int N,j,i,k;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
         a[i]=in.nextInt();
	     for(i=0;i<N;i++)
	    {
	    	if(i%2==0&&a[i]%2!=0 || i%2!=0&&a[i]%2==0)
	    	{
	    	System.out.print(a[i]+" ");
	    	count++;
	    	}
	    }
	    if(count==0)
	    System.out.println("1");
    }
}
