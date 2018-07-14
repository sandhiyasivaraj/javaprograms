package guvi.Set3;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class CaseChange {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char ch[]=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]>='a' && ch[i]<='z')
                ch[i]=(char)((int)ch[i]-32);
            else
                ch[i]=(char)((int)ch[i]+32);
        }
        s=String.valueOf(ch);
        System.out.println(s);
    }
}
