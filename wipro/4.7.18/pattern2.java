/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package today;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class Pattern2 {
    public static void main(String[] args) {
        
    
    Scanner in=new Scanner(System.in);
    int N=in.nextInt(),i,j,k;
    for( i=1;i<=N;i++)
    {     
        for( j=i;j<=N;j++)
        {
            System.out.print(j);
        }
        
        for( k=1;k<i;k++)
        {
            System.out.print(k);
        }
        System.out.println();
    }
    }
}
