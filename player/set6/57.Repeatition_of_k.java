

package GuviPlayerSet6;

import java.util.Scanner;

public class FirstOccouranceOfK {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.next();
        String K=in.next();
        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if((int)S.charAt(i)==(int)K.charAt(0)){
                
               count++;
            }

        }
        System.out.println(count);
    }
}
