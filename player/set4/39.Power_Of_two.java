
package GuviPlayerSet4;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        while(N%2==0 && N!=0)
        {
            N=N/2;
        }
        if(N==1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
