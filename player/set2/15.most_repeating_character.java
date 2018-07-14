package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class MostRepeatedLetter {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        int max=Integer.MIN_VALUE,count=0;
        char c=' ';
        char ch[]=S.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    count++;
                }
            }
            if(count>max)
            {
                max=count;
                c=ch[i];
            }
        }
        System.out.println(c);
    }
}
