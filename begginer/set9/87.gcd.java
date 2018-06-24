package beginner_set9;
import java.util.Scanner;
public class GCD {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int max=Integer.MIN_VALUE;
		for(int i=1;i<=N1;i++)
		{
			if(N1%i==0 &&N2%i==0)
			{
				max=i;
			}
		}
		System.out.print(max);
	}

}
