/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wipro;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Stringweight {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        int v=in.nextInt();
        int sum=0;
        char ch[]=S.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(v==1)
                sum=sum+((int)ch[i]-96);
            else
            {
                if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
                {
                    sum=sum+((int)ch[i]-96);
                }
            }
        }
        System.out.println(sum);
    }
}
