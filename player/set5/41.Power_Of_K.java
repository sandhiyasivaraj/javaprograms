
package GuviPlayerSet5;

import java.util.Scanner;

public class PowerOfK {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int K=in.nextInt();
        while(N%K==0 && N!=0)
        {
            N=N/K;
        }
        if(N==1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
