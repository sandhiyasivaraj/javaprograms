package beginner;

importjava.util.Scanner;

public class Range {

	private static Scanner in;

	public static void main(String[] args) {
	in = new Scanner(System.in);
	intN=in.nextInt();
	intL=in.nextInt();
	intR=in.nextInt();
	if(N>L&&N<R)
	{
		System.out.print("yes");
	}
	else
		System.out.print("no");
	}

}
