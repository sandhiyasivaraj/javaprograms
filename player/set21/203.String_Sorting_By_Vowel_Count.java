
package GuviSet21;

import java.util.Scanner;


public class String_Sorting_By_Vowel_Count {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),count,arr[]=new int[N],temp=0;
        String s[]=new String[N],stemp="";
        for(int i=0;i<N;i++)
        {
            s[i]=in.next();
        }
        for(int i=0;i<N;i++)
        {
            count=0;
            String S=s[i].toLowerCase();
            for(int j=0;j<S.length();j++)
            {
                if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u')
                {
                    count++;
                }
                arr[i]=count;
            }
        }
        for(int i=0;i<N-1;i++)
            {
            for(int j=i+1;j<N;j++)
            {
                if(arr[i]<arr[j])
                {
                    temp=arr[i];stemp=s[i];
                    arr[i]=arr[j];s[i]=s[j];
                    arr[j]=temp;s[j]=stemp;
                }
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.println(s[i]);
        }
    }
}
