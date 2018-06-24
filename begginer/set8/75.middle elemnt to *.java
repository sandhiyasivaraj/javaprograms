package beginner;

import java.util.Scanner;

public class Middle_element {
	private static Scanner sc;
	public static void middle_element(String S) {
		int l=S.length();
		char ch[]=S.toCharArray();
		for(int i=0;i<l;i++)
		{
			ch[(l/2)]='*';
			if(l%2==0)
			{
				ch[(l/2)-1]='*';
			}
			System.out.print(ch[i]);
		}
		
	 }
	Public static void main(String[] args) {
	sc = new Scanner(System.in);
	 String S=sc.next();
	middle_element(S);
	

	}

}
