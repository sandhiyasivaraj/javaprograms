import java.util.Scanner;
public class HelloWorld{

    public static String CheckBalancedParanthesis(String s){
        char ch[]=s.toCharArray();
        int count=0,count1=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='(')
                count++;
            else if(ch[i]==')')
                 count1++;
        }
        if(count==count1)
            return("yes");
        else
            return("no");
    }
     public static void main(String []args){
         Scanner in=new Scanner(System.in);
         String S=in.next();
         String res=CheckBalancedParanthesis(S);
        System.out.println(res);
     }
}
