package beginner;

import java.util.Scanner;

public class Factors {

private static Scanner sc;
public static void factors(int n) {	
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		System.out.print(i+" ");
	}
}
}
Public static void main(String[] args) {
sc = new Scanner(System.in);
int N=sc.nextInt();
factors(N);
}

}
