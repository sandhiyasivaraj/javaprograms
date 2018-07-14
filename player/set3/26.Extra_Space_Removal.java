package guvi.Set3;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class SpaceRemoval {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        char ch[]=S.toCharArray();
        int l=ch.length;
        for(int i=0;i<l;i++)
        {
            if(ch[i]==' ')
            {
                if(ch[i+1]==' ')
                {
                    for(int j=i+1;j<l;j++)
                    {
                        ch[j-1]=ch[j];
                    }
                    l=l-1;
                  
                }
                else{
                    for(int j=i+1;j<l;j++)
                    {
                        ch[j-1]=ch[j];
                    }
                    l=l-1;
                }
                
            }
        }
        for(int i=0;i<l;i++)
            System.out.print(ch[i]);
    }
}
