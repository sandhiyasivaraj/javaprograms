import java.util.*;
import java.lang.*;
import java.io.*;
public class Matrix{

     public static void main(String []args){
         int n,i,j;
         Scanner in=new Scanner(System.in);
         n=in.nextInt();
         int a[]=new int[n];
         for(i=0;i<n;i++)
         a[i]=in.nextInt();
         for(i=0;i<n;i++)
         {
             int product=1;
             for(j=0;j<n;j++)
             {
                 if(j!=i)
                 {
                     product=product*a[j];
                 }
             }
             System.out.print(product+" ");
         }
     }
}
