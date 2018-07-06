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
public class ConsecutiveNAME {
    public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
        int N=in.nextInt(),i,j,temp;
        String name[]=new String[N],temp1;
        for(i=0;i<N;i++)
        {
            name[i]=in.next();
        }
        int id[]=new int[N],count = 0;
         for(i=0;i<N;i++)
        {
            id[i]=in.nextInt();
        }
         for(i=0;i<N;i++)
         {
             for(j=i+1;j<N;j++)
             {
                 if(id[i]>id[j])
                 {
                     temp=id[i];temp1=name[i];
                     id[i]=id[j];name[i]=name[j];
                     id[j]=temp;name[j]=temp1;
                 }
             }
         }
         for(i=0;i<N-2;i++)
         {
             count=0;
            for(j=i+1;j<i+3;j++)
            {
                if(id[j]==id[i]+1 || id[j]==id[i]+2)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(name[i]+name[i+1]+name[i+2]);
                break;
            }
         }
         if(count==0)
         {
             System.out.println("NULL");
         }
    }
}
