package guvi.Set3;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class PerfectSquare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int l=in.nextInt();
        int r=in.nextInt(),count=0;
        for(int i=l;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j*j==i)
                {
                    System.out.print(i+" ");
                    count++;
                }
            }
        }
        System.out.println(count);
            }
}
