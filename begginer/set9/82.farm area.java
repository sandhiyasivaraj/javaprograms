package beginner_set9;

import java.util.Scanner;

public class Farm_area {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		float L=sc.nextFloat();
		float B=sc.nextFloat();
		System.out.printf("%.5f",L*B);
	}

}
