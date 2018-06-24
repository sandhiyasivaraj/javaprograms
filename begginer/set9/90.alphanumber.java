
package beginner_set9;

import java.util.Scanner;

			public class Alphanumber
			{
				Private static Scanner sc;
	
				Public static void main(String[] args)
				{
						sc = new Scanner(System.in);
						String S=sc.next();
						char ch[]=S.toCharArray();
						for(int i=0;i<S.length();i++)
							{
							if((int)ch[i]>=48 && (int)ch[i]<=57)
							{
								System.out.print(ch[i]);
							}
							}
				}
			}

