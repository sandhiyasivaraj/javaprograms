/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package wipro;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Highestdigit {
    public static int highest_digit(int n){
        int max=Integer.MIN_VALUE;
        int count=0;
        int n1=n, r=n;
        while(n1!=0)
        {
           n1=n1/10;
           count++;
        }
        int arr[]=new int[count];
        
        int i=0;
            while(r!=0)
            {     
                arr[i]=r%10;
               
                r=r/10;
                i++;
            }
        int digit=Integer.MIN_VALUE;
       int flag=0;
        for( i=0;i<count;i++)
        {
            
            int c=0;
            for(int j=i+1;j<count;j++)
            {
                if(arr[i]==arr[j])
                {
                   flag=1;
                    c++;
                }
                if(c>max  )
                {
                    max=c;
                   
                    digit=arr[i];
                    
                }

                else if (c == max && arr[i] > digit )
                 {
                     max=c;
                    
                     digit=arr[i];
                    
                 }
               
            }
        }
        if(flag==0)
            return -1;

        return digit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=highest_digit(n);
        System.out.println(num);
    }
}
