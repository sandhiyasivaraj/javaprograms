package aug6;

import java.util.Scanner;

public class Father_Child {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String twodim[][]=new String[n][2];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2;j++)
			{
				twodim[i][j]=in.next();
			}
		}
		String grandfather=in.next();
		String child="";
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(grandfather.equals(twodim[i][1]))
			{
				child=twodim[i][0];
				
				for(int j=0;j<n;j++)
				{
					if(child.equals(twodim[j][1]))
					{
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
