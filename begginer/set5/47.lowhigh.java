import java.util.*;
import java.lang.*;
import java.io.*;
public class Lowhigh{

     public static void main(String []args){
         int N,i;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int arr[]=new int[N];
         int max=Integer.MIN_VALUE;
         int min=Integer.MAX_VALUE;
         for(i=0;i<N;i++)
         {
         arr[i]=in.nextInt();
         if(arr[i]>max)
         {
             max=arr[i];
         }
         if(arr[i]<min)
         {
             min=arr[i];
         }
         }
        System.out.print(min+" "+max);
     }
}
