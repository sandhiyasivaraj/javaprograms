package beginner_set9;

import java.util.Scanner;

public class Ninjas_difference {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int N=in.nextInt();
		int O=in.nextInt();
		System.out.printf("%d",Math.abs(O-N));
	}

}
