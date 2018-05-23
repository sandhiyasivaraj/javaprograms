import java.util.*;
import java.lang.*;
import java.io.*;
public class Maxoften{

     public static void main(String []args){
         int i,max;  
Scanner in=new Scanner(System.in);
int a[]=new int[10];
for(i=0;i<10;i++)
a[i]=in.nextInt();

	max=a[0];
	for(i=1;i<10;i++)
	{ 
	if(a[i]>max)
	{
		max=a[i];
	}
	}
	System.out.print(max);
     }
}
