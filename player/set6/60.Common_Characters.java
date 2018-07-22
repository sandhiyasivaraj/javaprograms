
package GuviPlayerSet6;

import java.util.Scanner;

public class CommonCharacters {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S1=in.next();
        String S2=in.next();
        int count=0;
        char ch1[]=S1.toCharArray();
        char ch2[]=S2.toCharArray();
        for(int i=0;i<S1.length();i++)
        {
            if(ch1[i]==ch2[i])
            {
                count++;
                break;
            }
        }
        if(count==0)
                 System.out.println("no");
        else
               System.out.println("yes");

    }
}
