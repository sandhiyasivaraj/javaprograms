package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class StringRevWithoutVowel {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        String S=in.nextLine();
        if(S.length()==N){
        String S1=S.replaceAll("[aeiou]","");
        S1=S1.replaceAll("[AEIOU]","");
        char ch[]=S1.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
            System.out.print(ch[i]);}
    }
}
