import java.util.*;
import java.lang.*;
import java.io.*;
public class Prime{

     public static void main(String []args){
        int N;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        int count=0;
        for(int i=2;i<N;i++)
        {
            if(N%i==0)
            {
                count++;
            }
        }
        if(count==0)
        System.out.println("yes");
        else
        System.out.println("no");
     }
}
