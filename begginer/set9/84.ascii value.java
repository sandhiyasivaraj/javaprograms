package beginner_set9;

import java.util.Scanner;

public class Ascii {

	private static Scanner sc;

	public static void main(String[] args) {
	sc = new Scanner(System.in);
	String S=sc.next();
Char Ch=S.charAt(0);
System.out.printf("%d", (int)Ch);
	}

}
