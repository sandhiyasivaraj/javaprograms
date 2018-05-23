import java.util.*;
import java.lang.*;
import java.io.*;
public class Digit{

     public static void main(String []args){
         int N,i,j;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int arr[]=new int[20];
         int sum=0;
         while(N!=0)
         {
             i=N%10;
             sum+=i;
             N=N/10;
         }
        System.out.print(sum);
     }
}
