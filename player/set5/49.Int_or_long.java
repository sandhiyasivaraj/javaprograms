
package GuviPlayerSet5;

import java.util.Scanner;
public class IntOrLong {
    public static void main(String[] args) {
        try{
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        System.out.println("INT");
        }
        catch(Exception e)
        {
            System.out.println("LONG");
        }
    }
}
