package guvi.Set3;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class StringSorting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
     int N=in.nextInt(),sum=0,arr[]=new int[N],temp;
     String s[]=new String[N],temps;
     for(int i=0;i<N;i++)
     {
         s[i]=in.next();
     }
     for(int i=0;i<N;i++)
     {
         sum=0;
         char ch[]=s[i].toCharArray();
         for(int j=0;j<ch.length;j++)
         {
            sum=sum+(int)ch[j]-96;
         }
         arr[i]=sum;
     }
     for(int i=0;i<N-1;i++)
     {
         for(int j=i+1;j<N;j++)
         {
             if(arr[i]>arr[j])
             {
                 temp=arr[i];temps=s[i];
                 arr[i]=arr[j];s[i]=s[j];
                 arr[j]=temp;s[j]=temps;
             }
         }
         
     }
      for(int i=0;i<N;i++)
            System.out.print(s[i]+" ");
    }
}
