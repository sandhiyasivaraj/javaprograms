
package GuviSet21;

import java.util.Scanner;

public class CatalanNumbers {
    public static int CatalanNumbers(int n){
         int res=0;
        if(n<=1)
            return 1;

        else{

        for(int i=0;i<n;i++) {
                res += CatalanNumbers(i) * CatalanNumbers(n - i - 1);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        for(int i=0;i<=N;i++)
        {
            System.out.print(CatalanNumbers(i)+" ");
        }
    }
}
