import java.util.*;
import java.lang.*;
import java.io.*;
public class NNumber{

     public static void main(String []args){
         int N,j,i;
         
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int a[]=new int[N];
         for(i=0;i<N;i++)
         a[i]=in.nextInt();
       int pos=N-1;
	for(i=0;i<N;i++)
	{
		for(j=i+1;j<N;j++)
		{
		    if(a[i]==a[j])
		{
		    if(pos>j)
		    pos=j;
		}
		
	  }
	}
   
     System.out.print(a[pos]);
	
     }
}
