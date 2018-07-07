
package GuviPlayerSet2;

import java.util.Scanner;

public class ArrayRotation {
    public static int[] rightrotation(int[] arr,int n){
        int temp=arr[n-1];
        
        for(int i=n-1;i>0;i--)
            arr[i]=arr[i-1];
        arr[0]=temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        int a[]=new int[N];
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
            a[i]=in.nextInt();
        for(int i=0;i<K;i++)
            arr=rightrotation(a,N);
        for(int i=0;i<N;i++)
            System.out.print(a[i]+" ");
    }
}
