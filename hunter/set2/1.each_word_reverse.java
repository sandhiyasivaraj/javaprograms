import java.util.*;
import java.lang.*;
import java.io.*;
public class EachStrRev
{
     public static void main(String []args)
     {
         int i,j;
         Scanner in=new Scanner(System.in);
         String str=in.nextLine();
         String[] words=str.split(" ");
         for(i=0;i<words.length;i++)
         {
             String newword=words[i];
              
             for(j=newword.length()-1;j>=0;j--)
             {
                 System.out.print(newword.charAt(j));
               
             }
             System.out.print(" ");
         }
         
      }
}
