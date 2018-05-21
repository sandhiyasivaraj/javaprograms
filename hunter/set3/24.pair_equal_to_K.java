import java.util.*;
import java.lang.*;
import java.io.*;
public class Matrix{

     public static void main(String []args){
         int N,K,i,j,sum;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         K=in.nextInt();
         int A[]=new int[N];
         for(i=0;i<N;i++)
         A[i]=in.nextInt();
         int count=0;
         for(i=0;i<N;i++)
         {
              for(j=i+1;j<N;j++)
             {
                 if(A[i]+A[j]==K)
                 {
                    count++;
                 }
             }
         }
             if(count!=0)
             System.out.print("YES");
             else
              System.out.print("NO");
         
     }
}
