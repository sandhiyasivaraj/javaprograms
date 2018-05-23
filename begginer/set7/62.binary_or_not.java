import java.util.*;
import java.lang.*;
import java.io.*;
public class Binaryrep{

     public static void main(String []args){
         String S;
         
        Scanner in=new Scanner(System.in);
       S=in.next();
       
       char ch[]=S.toCharArray();
       int count=0;
       for(int i=0;i<ch.length;i++)
       {
           if(ch[i]!='0'&& ch[i]!='1')
           {
           count++;
           break;
           }
       }
       if(count==1)
        System.out.println("no");
        else
        System.out.println("yes");
     }
}
