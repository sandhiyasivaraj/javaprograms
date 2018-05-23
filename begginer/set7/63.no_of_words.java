import java.util.*;
import java.lang.*;
import java.io.*;
public class NoOfWords{

     public static void main(String []args){
        String S;
        Scanner in=new Scanner(System.in);
        S=in.nextLine();
        String[] words=S.split(" ");
        int count=0;
        for(String i:words)
        count++;
        System.out.println(count);
     }
}
