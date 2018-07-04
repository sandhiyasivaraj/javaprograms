/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package today;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class Today {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),k=N;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<k;j++)
            {
                System.out.print(k);
            }
            for(int l=0;l<i*2;l++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<k;j++)
            {
                System.out.print(k);
            }
            k--;
            System.out.println();
        }
    }
    
}
/*input 9
output
999999999999999999
88888888  88888888
7777777    7777777
666666      666666
55555        55555
4444          4444
333            333
22              22
1                1*/
