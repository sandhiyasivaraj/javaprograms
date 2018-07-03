package sandhiya;

import java.util.Scanner;

public class ProperDivisor {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
int N=sc.nextInt();
int sum=0;
for(int i=1;i<N;i++)
{
	if(N%i==0)
	{
		sum=sum+i;
	}
}
System.out.println(sum);
	}

}
