
package GuviSet21;

import java.util.Scanner;

public class SumOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        int sum=0;
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
            if(arr[i]<0)
                sum +=arr[i];
        }
        System.out.println(sum);
    }
}
