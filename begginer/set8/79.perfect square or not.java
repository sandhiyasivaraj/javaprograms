package beginner;

import java.util.Scanner;

public class Perfect_square {

private static Scanner sc;
public static void perfectsquare(int n) {	
double ps=Math.sqrt(n);
	if(ps-Math.floor(ps)==0)
	{
		System.out.print("yes");
	}
	else
		System.out.print("no");
		
}
Public static void main(String[] args) {
sc = new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
perfectsquare(N*M);
}

}
