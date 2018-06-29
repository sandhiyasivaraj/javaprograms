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
public class Nonprimeaddtion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum=arr[0]+arr[1];
       
        for(int i=1;i<n;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count!=0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);
    }
}
