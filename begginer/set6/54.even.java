import java.util.*;
import java.lang.*;
import java.io.*;
public class Even{

     public static void main(String []args){
         int N,i,j;
         Scanner in=new Scanner(System.in);
         N=in.nextInt();
         if(N%2!=0)
         System.out.print(N-1);
         else
        System.out.print(N);
     }
}
