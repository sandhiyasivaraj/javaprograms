
package GuviPlayerSet6;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        int count=0;
       char ch[]=S.toCharArray();
        for(char c:ch)
        {
            count++;
        }
        System.out.println(count);
    }
}
