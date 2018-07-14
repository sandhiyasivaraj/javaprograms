package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class NonRepeatedInt {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<N;i++)
        {
            int count=0;
            for(int j=0;j<N;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count==1)
                System.out.println(arr[i]);
        }
    }
}
