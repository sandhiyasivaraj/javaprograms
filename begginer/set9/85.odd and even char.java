package beginner_set9;
import java.util.Scanner;
public class OddEvenChar {
	private static Scanner sc;
	public static void main(String[] args) {
			sc = new Scanner(System.in);
			String S=sc.next();
			Int j,k,l,m;
			if(S.length()%2==0)
			{
			j=S.length()/2;
		l=j;
			k=S.length()/2;
			m=k;
			}
			else
			{
		j=S.length()/2;
		l=j;
			k=S.length()/2+1;
			m=k;
			}
		Char Ch[]=S.toCharArray();
		Char ChO[]=newchar[j];
		Char ChE[]=newchar[k];
		for(int i=0;i<S.length();i++)
		    {
			
			if(i%2!=0)
			{
				
				ChO[l-j]=Ch[i];
				j--;
				
			}
			
			else
			{
				ChE[m-k]=Ch[i];
				k--;
			}
			
				
		    }
		    String S1=newString(ChE);
		    String S2=newString(ChO);
		System.out.print(S1+" "+S2);
			}

		}



