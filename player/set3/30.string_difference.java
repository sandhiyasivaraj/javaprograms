package guvi.Set3;

import java.util.Scanner;

/**
 *
 * @author Ka
 */
public class StringDifference {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int k=in.nextInt(),count=0;
        if(s1.length()!=s2.length())
            System.out.println("no");
        else
        {
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();
        for(int i=0;i<s1.length();i++)
        {
            if(c1[i]!=c2[i])
                count++;
        }
        }
        if(count==k)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
