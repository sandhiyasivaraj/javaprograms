
package GuviPlayerSet1;

import java.util.Scanner;

public class PrimeCount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int r=in.nextInt();
        int flag=0;
        if(l==1)
            l=l+1;
        for(int i=l;i<=r;i++)
        {
            int count=0;
            for(int j=2;j<i;j++)
            {

                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                flag++;
            }
        }
        System.out.println(flag);
    }
}
