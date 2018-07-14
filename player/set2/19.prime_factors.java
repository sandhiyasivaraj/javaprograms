package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        for(int i=2;i<=N;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2)
            {
                if(N%i==0)
                    System.out.print(i+" ");
            }
        }
    }
}
