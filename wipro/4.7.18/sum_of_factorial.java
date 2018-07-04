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
public class SumOfFact {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++)
        {
            int fact=1;
                    for(int j=1;j<=i;j++)
                    {
                      fact=fact*j;  
                    }
                    sum=sum+fact;
        }
        System.out.println(sum);
    }
}
