package aug6;

import java.util.Arrays;
import java.util.Scanner;

public class Next_Greater_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		while(T!=0) {
		int n=in.nextInt(),min=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=in.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			int max=Integer.MAX_VALUE;
			min=arr[i];
			
			for(int j=0;j<n;j++)
			{
				if(arr[j]>min && arr[j]<max)
					max=arr[j];
			}
			String m="";
			if(max==Integer.MAX_VALUE)
			{
				m="_";
			}
			else
			{
				m=String.valueOf(max);
			}
			System.out.print(m+" ");
		}
		T--;
		}
	}

}
