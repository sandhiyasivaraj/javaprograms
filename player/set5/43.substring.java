
package GuviPlayerSet5;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        String sub=in.next();int flag=0;
        if(S.contains(sub))
            System.out.println("yes");
        else
            System.out.println("no");
  
    }
}
