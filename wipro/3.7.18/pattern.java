package sandhiya;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		for(int i=1;i<=N;i++)
		{
			int k=i,l=N;
		for(int j=i;j<=N;j++)
		{
			System.out.print(k+" ");
			k=k+l;
			l--;
		}
		System.out.println();
		}
	}

}
