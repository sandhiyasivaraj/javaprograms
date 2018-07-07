
package GuviPlayerSet1;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String s){
        char ch[]=s.toCharArray();
        char ch1[]=new char[s.length()];
        int i,j;
        for(i=0,j=s.length()-1;i<s.length()&&j>=0;i++,j--)
            ch1[j]=ch[i];
        String r=new String(ch1);
        return r;
    }
    public static void main(String[] args) {
        Scanner iin=new Scanner(System.in);
        String S=iin.next();
        String s=reverseString(S);
        System.out.println(s);
    }
}
