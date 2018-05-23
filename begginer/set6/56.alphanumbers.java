import java.util.*;
import java.lang.*;
import java.io.*;
public class Alphanumbers{

     public static void main(String []args){
         String S;
        Scanner in=new Scanner(System.in);
       S=in.next();
       char ch[]=S.toCharArray();
       int count=0;
       for(int i=0;i<ch.length;i++)
       {
           if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9')
           {
              count++;
           }
       }
           if(count!=0)
            System.out.print("Yes");
           else
           System.out.print("No");
        
     }
}
