package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class LCM {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int r=in.nextInt();
        int gcd=1,lcm=0;
        for(int i=1;i<=l&&i<r;i++)
        {
            if(l%i==0 && r%i==0)
                gcd=i;
        }
        lcm=(l*r)/gcd;
        System.out.println(lcm);
    }
}
