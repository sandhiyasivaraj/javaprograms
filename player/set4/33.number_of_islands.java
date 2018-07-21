/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GuviPlayerSet4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NumberOfIslands {
    public static int totalisland(int[][] a,int n){
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i][j]==1){
                if(i==0 && j==0)
                {
                    if(a[i+1][j]==0 && a[i][j+1]==0) {
                        count++;
                    }
                }
                else if (i == n - 1 && j == n - 1)
                {
                    if(a[i-1][j]==0 && a[i][j-1]==0) {
                        count++;
                    }
                }
                else if (i == 0 && j == n - 1)
                {
                    if(a[i+1][j]==0 && a[i][j-1]==0) {
                        count++;
                    }
                }
                else if(i == n - 1 && j == 0)
                {
                    if(a[i-1][j]==0 && a[i][j+1]==0) {
                        count++;
                    }
                }

                else if (i == 0 && j != 0)
                {
                    if(a[i+1][j]==0 && a[i][j+1]==0 && a[i][j-1]==0)
                        count++;
                }
                else if(i==n-1 && j!=0)
                {
                     if(a[i-1][j]==0 && a[i][j+1]==0 && a[i][j-1]==0)
                        count++;
                }

                else{
                    if(a[i+1][j]==0 && a[i-1][j]==0 &&a[i][j-1]==0 &&a[i][j+1]==0)
                        count++;
                }
            }}
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int arr[][]=new int[N][N];
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++){
                arr[i][j]=in.nextInt();}
        }
        if(N==1)
        {
            if(arr[0][0]==1)
            System.out.println("1");
        else
            System.out.println("0");
    }
        else {
        int count=totalisland(arr,N);
        System.out.println(count);
    }
    }
}
