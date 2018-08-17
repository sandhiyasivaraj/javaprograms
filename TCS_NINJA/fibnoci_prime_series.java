
package wipro;

import java.util.Scanner;

public class Prime_Fib_Series {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),p=0;
        if(N%2==0)
        {
            int n=N/2;
            int i=2,count=0;
            while(count!=n)
            {
                int flag=0;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                        flag=1;
                }
                if(flag==0)
                {
                    count++;
                    p=i;
                }
                i++;
            }
        }
        else{
            int f1=1,f2=1,f3=0,n=N/2+1;
            if(n==1 || n==2)
            {
                p=1;
            }
            else{
            for(int i=2;i<n;i++)
            {
             f3=f1+f2;
             f1=f2;
             f2=f3;
            }
            p=f3;
            }
        }
        System.out.println(p);
    }

}

/*series:1,2,1,3,2,5,3,7,5,11,8,13,13,17,21,...
input 14   , 13
output 17  , 13
*/
