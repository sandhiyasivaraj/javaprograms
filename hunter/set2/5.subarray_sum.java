import java.util.*;
import java.lang.*;

public class Subarraysum
{  
    public static void main(String args[])
    {
        int N,i,j;
        Scanner in=new Scanner(System.in);
        N=in.nextInt();
        int a[]=new int[N];
        for(i=0;i<N;i++)
            a[i]=in.nextInt();
        int max=Integer.MIN_VALUE;
        for(i=0;i<N;i++)
        {
            int sum=0;
            for(j=i;j<N;j++)
            {
                sum=sum+a[j];
                if(sum>max)
                    max=sum;
            }
        }
        System.out.println(max);
        
    }
}
