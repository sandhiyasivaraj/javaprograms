import java.util.*;
import java.lang.*;
import java.io.*;
public class Digit{

     public static void main(String []args){
         int N,i,j;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         int count=0;
         while(N!=0)
         {
             count++;
             i=N%10;
             N=N/10;
         }
        System.out.print(count);
     }
}
