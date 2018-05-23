import java.util.*;
import java.lang.*;
import java.io.*;
public class PowerOfTwo{

     public static void main(String []args){
         int N;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int count=0;
         while(N!=1)
         {
             if(N%2!=0)
             {
               count++;
               break;
             }
             N=N/2;
         }
         if(count==1)
         System.out.println("no");
         else
         System.out.println("yes");
     }
}
