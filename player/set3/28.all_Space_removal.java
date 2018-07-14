package guvi.Set3;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class AllSpaceRemoval {
     public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        S=S.replaceAll(" ", "");
         System.out.println(S);
     }
}
