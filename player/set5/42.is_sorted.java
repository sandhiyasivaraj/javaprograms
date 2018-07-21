
package GuviPlayerSet5;

import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N],i,j=0;
        for(i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        int count=0;
       for(j=0;j<N-1;j++)
       {
            if(arr[j]<=arr[j+1])
            {
                count++;
            }
        }
        if(count==N-1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
