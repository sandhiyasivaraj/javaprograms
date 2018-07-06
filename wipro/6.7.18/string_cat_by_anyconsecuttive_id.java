/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package july6;

import java.util.Scanner;

/**
 *
 * @author skcet
 */
public class July6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int N=in.nextInt(),i,j;
        String name[]=new String[N];
        for(i=0;i<N;i++)
        {
            name[i]=in.next();
        }
        int id[]=new int[N],count = 0,count1 = 0,a = 0,b = 0;
         for(i=0;i<N;i++)
        {
            id[i]=in.nextInt();
        }
         for(i=0;i<N;i++)
         {
             count=0;
             count1=0;
             a=0;b=0;
             for(j=i+1;j<N;j++)
             {
                 if(id[j]==id[i]+1)
                 {
                     count++;
                     a=j;
                 }
                 if(id[j]==id[i]+2)
                 {
                     count++;
                     b=j;
                 }
                 if(id[j]==id[i]-1)
                 {
                     count1++;
                     a=j;
                 }
                 if(id[j]==id[i]-2)
                 {
                     count1++;
                     b=j;
                 }
             }
            // System.out.print(id[i]+" "+count+" "+count1);
         if(count==2||count1==2)
             break;
         
         
         }
         if(count==2)
         {
             System.out.println(name[i]+name[a]+name[b]);
         }
        if(count1==2)
         {
             System.out.println(name[b]+name[a]+name[i]);
         }
        else
            System.out.println("NULL");
    }
    
}


/* *
ip
3
happy sad woder
3 5 7
op  NULL

ip
3
happy sad woder
3 4 5
op  happysadwonder*
*/
