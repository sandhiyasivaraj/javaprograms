import java.util.*;
import java.lang.*;
import java.io.*;
public class Fibonacci{

     public static void main(String []args){
         int N,f1=1,f2=1,f3,i;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        System.out.print(f1+" "+f2);
        for(i=2;i<N;i++)
        {
        f3=f1+f2;
        f1=f2;
        f2=f3;
        System.out.print(" "+f3);
        }
     }
}
