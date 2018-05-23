import java.util.*;
import java.lang.*;
import java.io.*;
public class Sum{

     public static void main(String []args){
        int N,M;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        M=in.nextInt();
        if((N+M)%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
      }
}
