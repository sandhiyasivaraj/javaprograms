/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GuviPlayerSet6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class KthSmallestNumber {
  public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[K-1]);
    }
}
