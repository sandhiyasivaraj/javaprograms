package beginner;

import java.util.Scanner;

public class Odd_digits {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		int n=N,l=N;
		while(n!=0)
		{
		count++;
		n=n/10;
		}
		Int a[]=newint[count];
		Int c=count;
		while(l!=0)
		{
			Int r=l%10;
			a[count-1]=r;
			l=l/10;
			count--;
		}
		
		for(int i=0;i<c;i++)
		{
			if(a[i]%2!=0)
			System.out.print(a[i]+" ");
		}
	}

}
