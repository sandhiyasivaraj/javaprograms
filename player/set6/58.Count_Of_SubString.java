
import java.util.Scanner;


public class SubSTringCount {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String S=in.nextLine();
        String sub=in.next();
        int count=0;
        String s[]=S.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(sub))
                count++;
        }
        System.out.println(count);
    }
}
