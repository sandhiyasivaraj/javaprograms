import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber{

     public static void main(String []args){
         int N,M,j,i;
         
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         M=in.nextInt();
         int a[]=new int[N];
         int b[]=new int[M];
         for(i=0;i<N;i++)
         a[i]=in.nextInt();
         for(i=0;i<M;i++)
         b[i]=in.nextInt();
         
       int count=0;
	for(i=0;i<M;i++)
	{
		for(j=0;j<N;j++)
		{
		    if(b[i]==a[j])
		{
		    count++;
		}
		
	  }
	}
    if(count==M)
     System.out.print("YES");
    else
     System.out.print("NO");
	
     }
}
