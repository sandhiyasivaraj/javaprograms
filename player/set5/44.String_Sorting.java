/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GuviPlayerSet5;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StringRotation {
    public static String StringRotation(String s,int k){
        char ch[]=s.toCharArray();
        char temp=' ';
        while(k!=0){
            temp=ch[s.length()-1];

        for(int i=s.length()-2;i>=0;i--)
        {
            ch[i+1]=ch[i];
        }
            ch[0]=temp;
            k--;
        }
        String a=new String(ch);
        return a;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        int K=in.nextInt();
        String s=StringRotation(S,K);
        System.out.println(s);
    }
}
