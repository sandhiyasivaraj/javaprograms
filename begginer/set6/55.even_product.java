import java.util.*;
import java.lang.*;
import java.io.*;
public class Evenproduct{

     public static void main(String []args){
         int N1,N2,P;
         Scanner in=new Scanner(System.in);
         N1=in.nextInt();
         N2=in.nextInt();
         P=N1*N2;
         if(P%2==0)
         System.out.print("even");
         else
        System.out.print("odd");
     }
}
