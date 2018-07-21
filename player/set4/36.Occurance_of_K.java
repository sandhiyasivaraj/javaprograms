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
public class OccuranceOfK {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       long N=in.nextLong();
        int K=in.nextInt();
        int count=0;
        while(N!=0)
        {
            if(N%10==K)
                count++;
            N=N/10;
        }
        System.out.println(count);
    }
}
