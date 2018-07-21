/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wipro;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BinarySearch {
    public static int binarysearch(int[] a,int l,int r,int x){
        if(r>=l){
        int mid=l+(r-1)/2;
        if(a[mid]>x)
            return binarysearch(a,l,mid-1,x);
        if(a[mid]==x)
            return mid;
        return binarysearch(a,mid+1,r,x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();//Enter number of elements in an array
        int K=in.nextInt();//Enter the element to be searched
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();//Enter the sorted array elements
        }
        int pos=binarysearch(arr,0,N-1,K);
        if(pos==-1)
            System.out.println("no");
        else
            System.out.println("yes");
        
    }
}
