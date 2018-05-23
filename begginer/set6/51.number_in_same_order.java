import java.util.*;
import java.lang.*;
import java.io.*;
public class Digit{

     public static void main(String []args){
         int N,i,j;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int arr[]=new int[20];
         j=0;
         int count=0;
         while(N!=0)
         {
             
             count++;
             i=N%10;
             arr[j]=i;
             N=N/10;
             j++;
         }
         for(i=count-1;i>=0;i--)
         {
        System.out.print(arr[i]+" ");
         }
     }
}
