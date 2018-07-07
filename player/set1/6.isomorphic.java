

package GuviPlayerSet1;

import java.util.Scanner;

public class Isomorphic {
    public static String areisomorphic(String s1,String s2){
        int m=s1.length(),n=s2.length();
        if(m!=n) {
            return "no";
        }
        String a=check(s1);
        String b=check(s2);
        if(a.equals(b)) {
            return "yes";
        }
        else {
            return "no";
        }
    }
    public static String check(String a){
        int i,j;
        char k='0',c;
        char ch1[]=new char[a.length()];
        char ch[]=a.toCharArray();
        for(i=0;i<a.length();i++)
        {
            if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z')
            {
            c=ch[i];
            k++;
            for(j=i+1;j<a.length();j++)
            {
                if(c==ch[j])
                {
                  ch1[j]=k;
                }  
            }
            }   
        }
        String s=new String(ch1);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        String res=areisomorphic(s1,s2);
        System.out.println(res);
    }
}
