package wipro;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */

public class Add {
    public static void add(String s1,String s2){
        int i;
        int l1=s1.length();
int l2=s2.length();

int sum;
if(l1>l2)
{
    for( i=0;i<l1-l2;i++)
    {
        
         s2=0+s2;
    }
}
     
if(l2>l1)
{
    for( i=0;i<l2-l1;i++)
    {
            s1=0+s1;
    }

}
    
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
int ch3[]=new int[ch1.length];
    
int k=0;
for(i=ch1.length-1;i>=0;i--)
{
   sum= (ch1[i]-48)+(ch2[i]-48)+k;
    
   ch3[i]=sum%10;
   if(sum>10)
       k=sum/10;
   else
       k=0;
    
}
for(i=0;i<ch3.length;i++)
    System.out.print(ch3[i]);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S1=sc.next();
        String S2=sc.next();
        add(S1,S2);
        
    }
}
