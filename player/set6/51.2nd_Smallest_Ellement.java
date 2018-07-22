
package GuviPlayerSet6;

import java.util.Arrays;
import java.util.Scanner;
public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        for(int i=1;i<N-1;i++)
        {
            if(arr[i-1]<arr[i] && arr[i]<arr[i+1] ||arr[i-1]<=arr[i] && arr[i]<arr[i+1] || arr[i-1]<arr[i] && arr[i]<=arr[i+1])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
