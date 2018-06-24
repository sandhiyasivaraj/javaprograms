package beginner;

import java.util.Scanner;

public class Composite {

private static Scanner sc;
public static void composite(int n) {

	int count=0;
for(int i=2;i<n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
if(n==1 || count==0)
	System.out.print("no");
else
	System.out.print("yes");

}
Public static void main(String[] args) {
sc = new Scanner(System.in);
int N=sc.nextInt();
composite(N);


}

}
