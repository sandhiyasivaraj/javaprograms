package wipro;

import java.util.Scanner;

public class HalfReverse {
    public static String reversebyhalf(String S,int n) {
        String s[]=S.split(" ");
        String N=Integer.toString(n);
        String s1="";
        for(int i=0;i<N.length();i++)
        {
            String a=s[Character.getNumericValue(N.charAt(i))-1];           
            if(a.length()%2!=0) {
            for(int j=a.length()/2;j>=0;j--)
                    s1=s1+a.charAt(j);                               
            }
            else {
                for(int j=a.length()/2-1;j>=0;j--)
                    s1=s1+a.charAt(j);
            }
            s1=s1+a.substring(a.length()/2, a.length());
            s1=s1+" ";
        }
        return s1;
    }
public static void main(String arg[]) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    int n=in.nextInt();
    String res=reversebyhalf(s,n);

    System.out.println(res);
}
}

/*
input:today is a nice day,41
output: nice dotday
explanation 4=nice,1=today  ni/ce=in/ce   to/d/ay=dot/day
*/
