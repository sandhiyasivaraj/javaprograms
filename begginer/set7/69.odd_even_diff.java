import java.util.*;
import java.lang.*;
import java.io.*;
public class Difference{

     public static void main(String []args){
        int N1,N2;
        Scanner in=new Scanner(System.in);
        N1=in.nextInt();
        N2=in.nextInt();
        if(Math.abs(N1-N2)%2==0)
        System.out.println("even");
        else
        System.out.println("odd");
     }
}
