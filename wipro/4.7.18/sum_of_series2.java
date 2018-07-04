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
public class SumOfSeries2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       double x=in.nextInt();
        double n=in.nextInt();
        double i,k,sum=0;
        for(i=1;i<=n;i++)
        {
            
            k=(Math.pow(x,i))/i;
            //System.out.println(k);
            sum+=k;
        }
        System.out.println(sum);
    }
}


/**
x/1  + x^2/2  +  x^3/3 +......+x^n/n

ip 5
   6
op  3444.583333333333
**/
