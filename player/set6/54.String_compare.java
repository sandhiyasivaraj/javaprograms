package GuviPlayerSet6;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S1=in.next();
        String S2=in.next();
        int count=0;
        if(S1.length()!=S2.length()) {
            System.out.println("no");
        }
        else{
        char ch1[]=S1.toCharArray();
        char ch2[]=S2.toCharArray();
        for(int i=0;i<S1.length();i++)
        {
            if(ch1[i]==ch2[i])
                count++;
        }
        if(count==S1.length())
                System.out.println("yes");
        else
                System.out.println("no");
        }
    }
}
