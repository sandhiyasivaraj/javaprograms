package beginner;
importjava.util.Scanner;
publicclassGreater_Multiple {
	privatestatic Scanner in;

	publicstaticintnearest10(intn){
		inta;
		a=(n/10)*10+10;
		returna;
	}

	publicstaticvoid main(String[] args) {
		in = new Scanner(System.in);
intN=in.nextInt();
inta=nearest10(N);
System.out.print(a);
