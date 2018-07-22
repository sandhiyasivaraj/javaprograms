package GuviPlayerSet5;

import java.util.Scanner;
public class OtherDivisorsThanOne {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),flag=0;
        for(int i=2;i<N;i++)
        {
            if(N%i==0)
            {
                flag=1;
                System.out.println("yes");
                break;
            }
        }
        if(flag==0)
            System.out.println("no");
    }
}
