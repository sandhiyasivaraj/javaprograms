
package GuviPlayerSet2;

import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        s=s.toLowerCase();
        if(s.equals("sunday")||s.equals("saturday"))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
