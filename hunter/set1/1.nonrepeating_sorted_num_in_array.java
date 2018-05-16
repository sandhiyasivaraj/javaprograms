import java.util.*;
import java.lang.*;
import java.io.*;
public class BigNumber{

     public static void main(String []args){
         int N,j,temp,i;
         
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int a[]=new int[N];
         for(i=0;i<N;i++)
         a[i]=in.nextInt();
         for(i=0;i<N;i++)
         {
         for(j=0;j<N-i-1;j++)
         {
             if(a[j]>a[j+1])
             {
                 temp=a[j];
                 a[j]=a[j+1];
                 a[j+1]=temp;
             }
         }
             
         }
         for(i=0;i<N;i++)
         {
             int count=0;
             for(j=i+1;j<N;j++)
             {
                 if(a[i]==a[j])
                {
                    count++;
                }
             }
             if(count>0)
             {
                System.out.print(a[i]+" ");
             }
             
             
         }
             
     }
}
