package beginner_set9;

import java.util.Scanner;

public class Calculator {
	private static Scanner sc;

	public static void main(String[] args) {
			sc = new Scanner(System.in);
				int N1=sc.nextInt();
				String C=sc.next();
				Int N2=sc.nextInt();
				Int ans;
				if(C.charAt(0)=='/')
				{
					ans = N1/N2;
					System.out.print(ans);
				}
				else
				{
					ans=N1%N2;
				System.out.print(ans);
				}
			}

		}
