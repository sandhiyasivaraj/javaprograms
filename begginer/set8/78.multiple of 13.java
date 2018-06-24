package beginner;

import java.util.Scanner;

public class Multiple13 {

private static Scanner sc;
public static void multiple(int n) {	

	if(n%13==0)
	{
		System.out.print("yes");
	}
	else
		System.out.print("no");
		
}
Public stati cvoid main(String[] args) {
sc = new Scanner(System.in);
int N=sc.nextInt();
multiple(N);
}

}
