import java.util.*;
import java.lang.*;
import java.io.*;
public class KAlpha{

     public static void main(String []args){
         String S;
         int k;
        Scanner in=new Scanner(System.in);
       S=in.next();
       k=in.nextInt();
       char ch[]=S.toCharArray();
       int count=0;
       for(int i=0;i<k;i++)
       {
           System.out.print(ch[i]);
       }
     }
}
