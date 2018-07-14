package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class Encoding {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        char ch[]=S.toCharArray();
        for(int i=0;i<ch.length;i++)
        { 
           if((ch[i]>='a' && ch[i]<='v')||(ch[i]>='A' && ch[i]<='V'))
               ch[i]=(char)((int)ch[i]+3);
           else if(ch[i]=='x'||ch[i]=='y'||ch[i]=='z'||ch[i]=='X'||ch[i]=='Y'||ch[i]=='Z')
               ch[i]=(char)((int)ch[i]-23);
        }
        String S1=new String(ch);
        System.out.println(S1);
    }
}
