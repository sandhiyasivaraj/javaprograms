/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GuviSet21;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        String v="";
        String c="";
        for(int i=0;i<S.length();i++)
        {
            if(Character.isLetter(S.charAt(i))){
            if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u'||S.charAt(i)=='A'||S.charAt(i)=='E'||S.charAt(i)=='I'||S.charAt(i)=='O'||S.charAt(i)=='U')
            {
                v=v+S.charAt(i);
            }
            else
                c=c+S.charAt(i);
            }
        }
        System.out.println(v+c);
    }
}
