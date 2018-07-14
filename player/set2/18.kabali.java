package guvi;

import java.util.Scanner;

/**
 *
 * @author K
 */
public class NumberOfAnagram {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),count=N,sum=0,sum1=0;
        String a="kabali";
        char ch[]=a.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='k')
                ch[i]='1';
            else if(ch[i]=='a')
                ch[i]='2';
            else if(ch[i]=='b')
                ch[i]='3';
            else if(ch[i]=='l')
                ch[i]='4';
            else if(ch[i]=='i')
                ch[i]='5';
            sum+=(int)ch[i]-48;
          
        }
       
        String s[]=new String[N];
        System.out.println(count);
        for(int i=0;i<N;i++)
        {
            s[i]=in.next();
            if(s[i].length()!=a.length())
                count--;
           
            else{
                char c1[]=s[i].toCharArray();
                sum1=0;
                 for(int j=0;j<s[i].length();j++)
                       {
                          if(c1[j]=='k')
                              c1[j]='1';
                          else if(c1[j]=='a')
                              c1[j]='2';
                          else if(c1[j]=='b')
                                c1[j]='3';
                          else if(c1[j]=='l')
                                c1[j]='4';
                          else if(c1[j]=='i')
                                c1[j]='5';
                          else
                               c1[j]='0';
                        
                           sum1+=(int)c1[j]-48;
                             
                        }
                
                 if(sum!=sum1)
                     count--;
                }
        }
        System.out.println(count);
        
    }
}
