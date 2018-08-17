package wipro;

import java.util.Scanner;

public class Subtraction {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>9) {
            String s=Integer.toString(n);
            int l=s.length();
            String dif="";
        for(int i=0;i<l-1;i++)
        {
            dif += Math.abs(Character.getNumericValue(s.charAt(i))-Character.getNumericValue(s.charAt(i+1)));
           
        }
        n=Integer.parseInt(dif);
        }
        System.out.println(n);
    }

}


/*
input:2847
explanation (2-8)(8-4)(4-7)=643
            (6-4)(4-3)=21
            (2-1)=1
output:1
*/
