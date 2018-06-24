package beginner;

importjava.util.Scanner;

publicclass Palindrome {

	privatestatic Scanner in;

	publicstaticvoid main(String[] args) {
		inti,j;
in = new Scanner(System.in);
 String S=in.next();
charch[]=S.toCharArray(); 
charch1[]=newchar[S.length()];
for(i=0,j=S.length()-1;i<S.length()&&j>=0;i++,j--)
 {
	ch1[j]=ch[i];
 }
intcount=0;
for(i=0;i<S.length();i++)
 {
	if(ch1[i]!=ch[i])
	 {
		count++;
	 }
 }
if(count==0)
	System.out.print("yes");
else
	System.out.print("no");
	}

}
