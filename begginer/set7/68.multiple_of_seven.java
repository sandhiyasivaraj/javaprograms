import java.util.*;
import java.lang.*;
import java.io.*;
public class DivisorSeven{

     public static void main(String []args){
        int N;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        if(N%7==0)
        System.out.println("yes");
        else
        System.out.println("no");
     }
}
