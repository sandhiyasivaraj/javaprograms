import java.util.*;
import java.lang.*;
import java.io.*;
public class BitwiseSwap{

     public static void main(String []args){
         int a,b;
         Scanner in=new Scanner(System.in);
         a=in.nextInt();
         b=in.nextInt();
         a=a^b;
         b=a^b;
         a=a^b;
        System.out.print(a+" "+b);
     }
}
