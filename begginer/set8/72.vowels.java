package beginner;

importjava.util.Scanner;

publicclass Vowel {

	privatestatic Scanner in;
publicstaticvoid vowels(String S) {
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
	publicstaticvoid main(String[] args) {
		
		in = new Scanner(System.in);
		String S=in.next();
		vowels(S);

	}

}
