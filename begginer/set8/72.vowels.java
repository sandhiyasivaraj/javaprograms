package beginner;

importjava.util.Scanner;

public class Vowel {

	private static Scanner in;
public static void vowels(String S) {
	S=S.toLowerCase();
	charch[]=S.toCharArray();
	intcount=0;
	for(inti=0;i<S.length();i++)
	 {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		 {
			count++;
		 }
	 }
	if(count==0)
		System.out.print("no");
	else
		System.out.print("yes");
 }
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		String S=in.next();
		vowels(S);

	}

}
