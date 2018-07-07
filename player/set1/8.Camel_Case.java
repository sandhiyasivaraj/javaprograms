package GuviPlayerSet1;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        S=S.toLowerCase();
        char ch[]=S.toCharArray();
        ch[0]=(char)((int)ch[0]-32);
        for(int i=0;i<S.length();i++)
        {
            if(ch[i]==' ')
                ch[i+1]=(char)((int)ch[i+1]-32);
        }
        String s=new String(ch);
        System.out.println(s);
    }
}
