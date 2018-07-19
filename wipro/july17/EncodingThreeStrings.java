package wipro;

import java.util.Arrays;
import java.util.Scanner;

public class StringEncoding {

class Result{
public final String output1;
public final String output2;
public final String output3;
public Result(String out1, String out2, String out3){
output1=out1;
output2=out2;
output3=out3;

}
}
public Result encodeThreeStrings(String input1, String input2, String input3){
String s[]=new String[3];
s[0]=input1;s[1]=input2;s[2]=input3;
String front=&quot;&quot;,middle=&quot;&quot;,end=&quot;&quot;;
for (String s1 : s) {
int l=s1.length();

switch (l%3) {
case 0:
int n=l/3;
front=front+s1.substring(0,n);
middle=middle+s1.substring(n, 2*n);
end=end+s1.substring(2*n,l);
break;
case 1:
front=front+s1.substring(0, l/3);
middle=middle+s1.substring(l/3, ((2*l)/3)+1);
end=end+s1.substring(((2*l)/3)+1,l);
break;
default:
front=front+s1.substring(0, (l/3)+1);
middle=middle+s1.substring((l/3)+1, ((2*l)/3));
end=end+s1.substring(((2*l)/3),l);
break;
}
}
char e[]=end.toCharArray();
for(int i=0;i&lt;end.length();i++)
{

if(Character.isUpperCase(e[i]))
e[i]=Character.toLowerCase(e[i]);
else
e[i]=Character.toUpperCase(e[i]);

}
String a=new String(e);
Result ob=new Result(front,middle,a);
return ob;
}
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
String s1=in.next();
String s2=in.next();
String s3=in.next();
StringEncoding SE=new StringEncoding();
Result r=SE.encodeThreeStrings(s1, s2, s3);
System.out.println(r.output1);
System.out.println(r.output2);
System.out.println(r.output3);
}

}
