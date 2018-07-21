
package GuviPlayerSet4;

import java.util.Scanner;

public class EveryThirdCharacter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        if(s.length()==1)
            System.out.println(s);
        else{
        for(int i=0;i<s.length();i+=3)
        {
            System.out.print(s.charAt(i));
        }
        }
    }
}
