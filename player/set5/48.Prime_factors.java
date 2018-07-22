package GuviPlayerSet5;
import java.util.Scanner;
public class PrimeFactors {
public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),count=0;
        for(int i=1;i<=N;i++)
        {
            count=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0 && N%i==0)
                 System.out.print(i+" ");
        }
    }
}
