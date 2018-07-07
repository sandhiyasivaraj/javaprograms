package GuviPlayerSet1;

import java.util.Scanner;

public class CharacterSwap {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char ch[]=s.toCharArray(),temp;
        for(int i=0;i<s.length()-1;i++)
        {
            if(i%2==0)
            {
                temp=ch[i];
                ch[i]=ch[i+1];
                ch[i+1]=temp;
            }
        }
        String S=new String(ch);
        System.out.println(S);
    }
}
