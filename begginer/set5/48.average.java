import java.util.*;
import java.lang.*;
import java.io.*;
public class Average{

     public static void main(String []args){
         int N,i,sum,avg;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int arr[]=new int[N];
         for(i=0;i<N;i++)
         arr[i]=in.nextInt();
         if(N%2==0)
         {
             sum=arr[0]+arr[N-1];
             avg=sum/2;
         }
         else
         {
             avg=arr[N/2];
         }
        System.out.print(avg);
     }
}
