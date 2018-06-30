/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wiprotask9;

import java.util.Scanner;

public class Pincreation {
    public static void pin(int n1,int n2,int n3){
        int arr[]=new int[4];
        arr[3]=(n1%10)<(n2%10)?((n1%10)<(n3%10)?(n1%10):(n3%10)):(n2%10)<(n3%10)?(n2%10):(n3%10);
      
        int a=((n1%100)/10),b=((n2%100)/10),c=((n3%100)/10);
        arr[2]=a<b?(a<c?a:c):b<c?b:c;
        
        int l=((n1%1000)/100),m=((n2%1000)/100),n=((n3%1000)/100);
        arr[1]=l<m?(l<n?l:n):m<n?m:n;
        
        int x=n1,y=n2,z=n3;
        int r1=0;
       while(x!=0)
        {
            if(x%10>r1) {
                r1 = x % 10;
            }
            x /= 10;
        }
         int r2=0;
       while(y!=0)
        {
            if(y%10>r2) {
                r2 = y % 10;
            }
            y /= 10;
        }
          int r3=0;
       while(z!=0)
        {
            if(z%10>r3) {
                r3 = z % 10;
            }
            z /= 10;
        }
          arr[0]=r1>r2?r1>r3?r1:r3:r2>r3?r2:r3;
          
        for(int i=0;i<4;i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N1=sc.nextInt();
        int N2=sc.nextInt();
        int N3=sc.nextInt();
        pin(N1,N2,N3);
    }
}
