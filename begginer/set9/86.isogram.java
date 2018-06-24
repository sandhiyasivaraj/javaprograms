package beginner_set9;

import java.util.Scanner;

public class Isogram {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String S=sc.next();
		int count[]=new int[S.length()];
		for(int i=0;i<S.length();i++)
		{
			count[i]=0;
		}
		char ch[]=S.toCharArray();
		for(int i=0;i<S.length();i++)
		{
			for(int j=0;j<S.length();j++)
			{
			if(ch[i]==ch[j])
				count[i]++;
			}
		}
		int flag=0;
		for(int i=0;i<S.length();i++)
		{
			if(count[0]!=count[i])
				flag++;				
		}
if(flag==0)
	System.out.print("Yes");
else
	System.out.print("No");
	}

}
