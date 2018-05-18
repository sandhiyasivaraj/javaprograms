import java.util.*;
import java.lang.*;
import java.io.*;
public class EKthNumber
{
     public static void main(String []args)
     {
         int N,K,i,j;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         K=in.nextInt();
         int a[]=new int[N];
         for(i=0;i<N;i++)
         a[i]=in.nextInt();
        int temp;
         for(i=0;i<N;i++)
         {
             for(j=i+1;j<N;j++)
             {
                 if(a[i]>a[j])
                 {
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                 }
             }
         }
         int max=0;
         int count=0;
         for(i=0;i<N;i++)
         {
             if(a[i]>max)
             {
                 max=a[i];
                 count++;
             if(count==K){
         System.out.println(max);
         break;
             }
             }
         }
         
      }
}
