
package GuviPlayerSet2;

import java.util.Scanner;

public class SumOfDigitSquares {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),sum=0;
        int n=N,square;
        while(n!=0)
        {
            square=(n%10)*(n%10);
            n/=10;
            sum+=square;
        }
        System.out.println(sum);
    }
}
