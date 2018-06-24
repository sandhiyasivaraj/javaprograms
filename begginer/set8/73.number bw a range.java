package beginner;

importjava.util.Scanner;

publicclass Range {

	privatestatic Scanner in;

	publicstaticvoid main(String[] args) {
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
