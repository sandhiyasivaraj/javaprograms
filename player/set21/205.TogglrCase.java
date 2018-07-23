
package GuviSet21;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        int N=S.length();
        String s="";
        for(int i=0;i<N;i++)
        {
            if(Character.isLowerCase(S.charAt(i)))
            {
               s += Character.toUpperCase(S.charAt(i));
            }
            else if(S.charAt(i)==' ')
                s += ' ';
            else
               s += Character.toLowerCase(S.charAt(i));
        }
        System.out.println(s);
    }
}
