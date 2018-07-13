
package guvi;

import java.util.Scanner;

public class Validation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        char ch[]=S.toCharArray();
        int flag=0;
        for(int i=0;i<S.length();i++)
        {
            if(!(Character.isDigit(ch[i])))
            {
                flag=1;
                System.out.println("no");
                break;
            }
         }
        if(flag==0)
            System.out.println("yes");
    }
}
