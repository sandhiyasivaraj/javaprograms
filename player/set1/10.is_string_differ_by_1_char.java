package GuviPlayerSet1;

import java.util.Scanner;

public class StringDIfference {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        if(s1.length()!=s2.length()) {
            System.out.println("no");
        }
        else
        {
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(ch1[i]!=ch2[i])
            {
                count++;
            }
        }
        if(count==1) {
                System.out.println("yes");
            }
        else {
                System.out.println("no");
            }
            }
    }
}
