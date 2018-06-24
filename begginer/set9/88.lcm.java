package beginner_set9;
import java.util.Scanner;
public class LCM {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int min=Integer.MAX_VALUE;
		for(int i=N1*N2;i>=N2;i--)
		{
			if(i%N1==0 &&i%N2==0)
			{
				min=i;
			}
		}
		System.out.print(min);
	}

}

