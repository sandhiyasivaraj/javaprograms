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
public class Pattern {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),i,j,l;
                int k=n;
        for(i=0;i<n;i++)
        {
            k -= 1;
            for(l=0;l<i;l++)
            {
                System.out.print(" "+" ");
            }
            for(j=k;j>=0;j--)
            {
                System.out.print((n+j)+" ");
            }
            for(j=1;j<=k;j++)
            {
                System.out.print((n-j)+" ");
            }
            System.out.println();
        }
    }
}

/*
ip5
op
9 8 7 6 5 4 3 2 1 
  8 7 6 5 4 3 2 
    7 6 5 4 3 
      6 5 4 
        5 
        */
