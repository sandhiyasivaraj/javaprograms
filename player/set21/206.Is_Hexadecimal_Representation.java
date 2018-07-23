
package GuviSet21;

import java.util.Scanner;

public class Is_Hexadecimal_Representation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        int flag=0;
        for(int i=0;i<S.length();i++)
        {
            
            if(!(Character.isDigit(S.charAt(i)))){
                
            if(S.charAt(i)!='A'&&S.charAt(i)!='B'&&S.charAt(i)!='C'&&S.charAt(i)!='D'&&S.charAt(i)!='E'&&S.charAt(i)!='F')
            {
                flag=1;
                break;
            }
        }
        }
        if(flag==1)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
