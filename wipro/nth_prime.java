/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sandy;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NthPrime {
    public static int nthprime(int n){
        int v=1;
        if(n==1) {
            return 2;
        }
        for(int i=3;i<1000;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                v++;
                if(v==n)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int ans=nthprime(N);
        System.out.println("answer "+ans);
    }
}
