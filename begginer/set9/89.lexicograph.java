package beginner_set9;



	import java.util.Scanner;
	public class Lexicograph {
		private static Scanner sc;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			sc = new Scanner(System.in);
			String S=sc.next();
			char temp;
			char ch[]=S.toCharArray();
			for(int i=0;i<S.length();i++)
			{
				for(int j=i+1;j<S.length();j++)
				{
				if((int)ch[i]>(int)ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
				}
			}
			String S1=newString(ch);
			System.out.print(S1);
		}

	}

