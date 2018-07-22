package GuviPlayerSet5;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int A1=in.nextInt();
        int A2=in.nextInt();
        int A3=in.nextInt();
        if(A1!=0 && A2!=0 && A3!=0)
        {
            if(A1+A2+A3==180)
            {
                System.out.println("yes");
            }
            else
                System.out.println("no");
        }
        else
            System.out.println("no");
    }
}
