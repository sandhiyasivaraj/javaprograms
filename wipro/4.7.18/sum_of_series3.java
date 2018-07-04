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
public class SumOfSeries3 {
    public static double fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return (double)fact;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        double n=in.nextInt();
        double i,j,k,sum=0;
        for(i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
            j=fact((int) i);
            k=(int)(Math.pow(x,i))/j;
            //System.out.println(k);
            sum+=k;
            }
            else
            {
                 j=fact((int) i);
            k=(int)(Math.pow(x,i))/j;
            //System.out.println(k);
            sum-=k;
            }
        }
        System.out.println(sum);
    }
}
/**
x/1 - x^2/2!  + x^3!  -.....

ip
2
3
op
1.3333333333333333
**/
