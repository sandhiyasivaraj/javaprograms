/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package GuviPlayerSet4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class LeastRepeatedCharacters {
    public static int FindMinCount(String s){
          char ch[]=s.toCharArray();
          int count=0,min=Integer.MAX_VALUE;
        for(int i=0;i<ch.length;i++)
        {
            count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    count++;
            }
            if(count<min)
                min=count;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        S=S.toLowerCase();
        int count1=0;
        int min=FindMinCount(S);
        char ch[]=S.toCharArray();
         for(int i=0;i<ch.length;i++)
        {
            count1=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                    count1++;
            }
            if(count1==min&& ch[i]!=' ')
                System.out.print(ch[i]+" ");;
        }
    }
}
